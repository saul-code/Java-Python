paises = ["Mexico","Argentina","Panama","Canada","Brasil"]

print(paises)
#manera 1
for pais in paises:
	nombre=pais.upper()
	print(nombre)
#manera 2
list(range(1,11))

for i in range(len(paises)):
	print(paises[i])

alumnos = [
    "Alexis",
    "Anneliesse",
    "Anonymous",
    "Rodo"
]
#añadir elementos en la lista
print(alumnos)
alumnos.append("Richard")
print(alumnos)

#multiplicar string
for i in range(5):
    print((i + 1) * "*")



def F(masa, acel):
    global paises
    paises.append("Venezuela")
    f = masa*acel
    return f

F(50,9.81)
print(paises)



