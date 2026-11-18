class Anuncio:
    def __init__(self, numero, precio):
        self.__numero = numero
        self.__precio = precio
    def getPrecio(self):
        return self.__precio
    def setPrecio(self, precio):
        self.__precio = precio
class Obra:
    def __init__(self, titulo, material, nombre1, ci1, añosExperiencia1, nombre2, ci2, añosExperiencia2, b):
        self.__titulo = titulo
        self.__material = material
        
        # Composicion
        self.a1 = Artista(nombre1, ci1, añosExperiencia1)
        self.a2 = Artista(nombre2, ci2, añosExperiencia2)
        
        # Agregacion
        self.b = b
        
    def getA1(self):
        return self.a1
    def getA2(self):
        return self.a2
    def getB(self):
        return self.b
    def setB(self, b):
        self.b = b
class Pintura(Obra):
    def __init__(self, titulo, material, nombre1, ci1, añosExperiencia1, nombre2, ci2, añosExperiencia2, b, genero):
        super().__init__(titulo, material, nombre1, ci1, añosExperiencia1, nombre2, ci2, añosExperiencia2, b)
        self.__genero = genero
class Artista:
    def __init__(self, nombre, ci, añosExperiencia):
        self.__nombre = nombre
        self.__ci = ci
        self.__añosExperiencia = añosExperiencia
    def getNombre(self):
        return self.__nombre 
    def getAñosExperiencia(self):
        return self.__añosExperiencia
# Main
anuncio1 = Anuncio(1, 300)
# a) Crear un objeto pintura que tenga un anuncio y otro objeto pintura sin anuncio
p1 = Pintura("Paisaje", "Oleo", "Hernan", 1234567, 10, "Carlos", 3456784, 2, anuncio1, "Oculto")
p2 = Pintura("La Noche", "Acuarela", "Juan", 4567895, 5, "Angel", 1546347, 3, None, "Realismo")
# b) Mostrar el nombre del artista con mas años de experiencia de ambas pinturas
mayor = p1.getA1()
if(p1.getA2().getAñosExperiencia() > mayor.getAñosExperiencia()):
    mayor = p1.getA2()
if(p2.getA1().getAñosExperiencia() > mayor.getAñosExperiencia()):
    mayor = p2.getA1()
if(p2.getA2().getAñosExperiencia() > mayor.getAñosExperiencia()):
    mayor = p2.getA2()
print("Artista con mayor experiencia: " , mayor.getNombre())
# c) Se ha decidido vender la pintura sin anuncio, se pide agregar un anuncio de venta y determine el monto total de venta de ambas pinturas
anuncio2 = Anuncio(2, 700)
p2.setB(anuncio2)
total = p1.getB().getPrecio() + p2.getB().getPrecio()
print("Monto total de ventas: ", total)