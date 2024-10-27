import unittest
from app import app

class TestApp(unittest.TestCase):
    def setUp(self):
        self.app = app.test_client()
        self.app.testing = True

    def test_store_string(self):
        response = self.app.post('/store', data='Prueba de cadena')
        self.assertEqual(response.status_code, 200)
        self.assertIn(b'String almacenada correctamente.', response.data)

    def test_search_word_found(self):
        self.app.post('/store', data='Cadena para probar búsqueda')
        response = self.app.post('/search', data='cadena')
        self.assertEqual(response.status_code, 200)
        self.assertEqual(response.json['count'], 1)

    def test_search_word_not_found(self):
        response = self.app.post('/search', data='inexistente')
        self.assertEqual(response.status_code, 200)
        self.assertEqual(response.json['count'], 0)

if __name__ == '__main__':
    unittest.main()
