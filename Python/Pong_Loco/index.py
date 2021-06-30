import pygame,sys
from pygame.locals import *

#constantes
WIDTH = 640
HEIGHT = 480
COLOR = (0,140,60)
IMAGEN = pygame.image.load('imagenes/fondo.jpg')

#Funciones
 

#main

def main():
    screen = pygame.display.set_mode((WIDTH,HEIGHT))
    pygame.display.set_caption("Prueba")
    screen.blit(IMAGEN,(0,0))


    while True:
        #screen.fill(COLOR)
        for events in pygame.event.get():
            if events.type == QUIT:
                sys.exit(0)
        pygame.display.flip()
        #pygame.display.update()
        

if __name__ == '__main__':
    pygame.init()
    main()
