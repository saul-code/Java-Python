import pygame,sys
from pygame.locals import *

#constantes
WIDTH = 640
HEIGHT = 480

#Funciones
 
def load_image(filename, transparent=False):
        try: image = pygame.image.load(filename)
        except: pygame.error, message 
        raise SystemExit, message
        image = image.convert()
        if transparent:
                color = image.get_at((0,0))
                image.set_colorkey(color, RLEACCEL)
        return image

#main

def main():
    screen = pygame.display.set_mode((WIDTH,HEIGHT))
    pygame.display.set_caption("Prueba")

    while True:
        for events in pygame.event.get():
            if events.type == QUIT:
                sys,exit(0)
    return 0

if __name__ == '__main__':
    pygame.init()
    main()
