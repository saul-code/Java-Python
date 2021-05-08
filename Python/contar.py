def contar_vocales(cad):
    voc = 0
    cons= 0
    if cad=='':
      print ("escribe algo pedazo de animal")
    for c in cad:
        if  c == ' ':
          continue
        if c == 'a' or c == 'e' or c == 'i' or c =='o' or c == 'u' or c == 'A' or c == 'E' or c == 'I' or c =='O' or c == 'U':
            voc=voc+1
        else:
           cons=cons+1
    return voc,cons
cad = input()
print (contar_vocales(cad))