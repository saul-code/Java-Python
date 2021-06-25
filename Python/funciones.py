def funcion():
	print ("HOla mundo")

def llamada_de_retorno(func=""):
	return (globals()[func]())

print (llamada_de_retorno("funcion"))

nombre = "funcion"

print (locals()[nombre]())