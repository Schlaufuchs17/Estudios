from flask import Flask, request, jsonify
import os
import unicodedata

app = Flask(__name__)
FILE_PATH = 'data.txt'

# Cargar o crear el fichero
if not os.path.exists(FILE_PATH):
    open(FILE_PATH, 'w').close()

def normalize_string(s):
    s = s.lower()
    s = ''.join(c for c in unicodedata.normalize('NFD', s) if unicodedata.category(c) != 'Mn')
    return s

@app.route('/store', methods=['POST'])
def store_string():
    data = request.data.decode('utf-8')
    with open(FILE_PATH, 'a') as f:
        f.write(data + '\n')
    return 'String almacenada correctamente.', 200

@app.route('/search', methods=['POST'])
def search_word():
    word = normalize_string(request.data.decode('utf-8'))
    count = 0
    with open(FILE_PATH, 'r') as f:
        for line in f:
            if word in normalize_string(line):
                count += 1
    return jsonify({'count': count})

if __name__ == '__main__':
    app.run(port=12345)
