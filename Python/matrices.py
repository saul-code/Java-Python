import numpy as np 

a = np.array([[1,2,3],[4,5,6],[7,8,9]])

b = np.array([[1,2,3],[4,5,6]])

def multi(array1,array2):
	try:
	  c = np.matmul(a,b)
	  print(c)
  except ValueError:
	  print("No se pueden multiplicar las matrices")

multi(a,b)


