#Aprendi a capturar datos con el metodo input y mostrar un mensaje

from math import pi as PI 

texto_capturado = input('Dame el radio de una esfera:\n')
radio = float(texto_capturado)
volumen = 4.0/3.0 * PI * radio**3

print ('El volumen de la esfera es: {}'.format(volumen))
