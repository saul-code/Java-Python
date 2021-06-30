import pygame,sys
from pygame.locals import *

#constantes
WIDTH = 640
HEIGHT = 480
COLOR = (0,140,60)
IMAGEN = pygame.image.load('imagenes/fondo.jpg')
direccion = True
#clases
class Pelota(pygame.sprite.Sprite):
    def __init__(self,color,radio,posicion=[WIDTH/2,HEIGHT/2],velocidad=[.5,-.5]):
        pygame.sprite.Sprite.__init__(self)
        self.color = color
        self.radio = radio
        self.velocidad = velocidad
        self.posicion = posicion



    def mover(self):
        global direccion
        if direccion == True:
            if self.posicion[0] < 620:
                self.posicion[0]+=self.velocidad[0]
            else:
                direccion = False
        else:
            if self.posicion[0] >20:
                self.posicion[0]+=self.velocidad[1]
            else:
                direccion = True
    def actualizar(self,time):
        self.posicion[0]+=self.velocidad[0]*time
        self.posicion[1]+=self.velocidad[1]*time
        if self.posicion[0]<=0 or self.posicion[0]>=WIDTH:
            self.velocidad[0]=-self.velocidad[0]
            self.posicion[0]+=self.velocidad[0]*time
        if self.posicion[1]<=0 or self.posicion[1]>=HEIGHT:
            self.velocidad[1] = -self.velocidad[1]
            self.posicion[1] +=self.velocidad[1]*time




#Funciones


#main

def main():
    
    screen = pygame.display.set_mode((WIDTH,HEIGHT))
    pygame.display.set_caption("Prueba")
    pelota = Pelota((1,45,120),20)
    clock = pygame.time.Clock() 
    #screen.blit(IMAGEN,(0,0))
    


    while True:
        tiempo = clock.tick(60)
        for events in pygame.event.get():
            if events.type == QUIT:
                sys.exit(0)

        pelota.actualizar(tiempo)
        screen.fill(COLOR) 
        pygame.draw.circle(screen,pelota.color,pelota.posicion,pelota.radio)

        pygame.display.flip()
        #pygame.display.update()
        

if __name__ == '__main__':
    pygame.init()
    main()
