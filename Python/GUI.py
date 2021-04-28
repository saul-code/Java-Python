import tkinter 

ventana = tkinter.Tk()
ventana.geometry('400x300')
#etiquetas
etiqueta = tkinter.Label(ventana, text = 'Hola', bg = 'cyan')

etiqueta.pack(side=tkinter.BOTTOM, fill=tkinter.X)

#caja de texto
cajaText = tkinter.Entry(ventana)
cajaText.pack()

#accion
def saludo():
	nombre = cajaText.get()
	etiqueta['text'] = nombre

def saludame(nombre):
	etiqueta['text'] = nombre

#botones
boton1 = tkinter.Button(ventana, text = 'presiona',padx = 20, pady = 30, command = saludo)

#Pasar parametros a mi funcion
boton2 = tkinter.Button(ventana, text = 'parametro', command = lambda: saludame('Saul'))

boton1.pack()

boton2.pack()




ventana.mainloop()


