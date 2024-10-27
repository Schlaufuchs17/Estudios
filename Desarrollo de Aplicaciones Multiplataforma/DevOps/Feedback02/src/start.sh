#!/bin/bash
# start.sh

echo "Iniciando el servidor Flask en el puerto 12345..."
export FLASK_APP=app.py
flask run --port=12345
