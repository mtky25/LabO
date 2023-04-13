
#Classe Mãe
class Poligono:
    def __init__(self,lados):
        self.lados = lados

    def calcula_perimetro(self):
        return sum(self.lados)
    
    def print_perimetro(self):
        print("Perímetro =",self.calcula_perimetro())
    

# Classe Filha
class Triangulo(Poligono):
    def __init__(self, lado1, lado2, lado3):
        Poligono.__init__(self,[lado1, lado2, lado3])
        
    
    def calcular_area(self):
        p = Poligono.calcula_perimetro(self)/2
        a = p*(p - self.lados[0])*(p - self.lados[1])*(p - self.lados[2])
        return a**0.5 #raiz
    
    def print_area(self):
        print("Área =",self.calcular_area())

    def ordena(self):
        if self.lados[0] > self.lados[1] and self.lados [0] > self.lados[2]:
            h = self.lados[0]
            c1 = self.lados[1]
            c2 = self.lados[2]
        elif self.lados[1] > self.lados[2] and self.lados [1] > self.lados[0]:
            h = self.lados[1]
            c1 = self.lados[0]
            c2 = self.lados[2]

        else:
            h = self.lados[2]
            c1 = self.lados[1]
            c2 = self.lados[0]

        return [c1,c2,h]

class TrianguloRetangulo(Triangulo):
    def __init__(self, lado1, lado2, lado3):
        super().__init__(lado1, lado2, lado3)
        if not(self.validar()):
            print("Valores inválidos")
            return
        
    def validar(self):
        lados = Triangulo.ordena(self)
        if lados[2]**2 == lados[1]**2 + lados[0] ** 2:
            return True
        else:
            return False

    def calcular_area(self):
        lados = Triangulo.ordena(self)
        return (lados[0] * lados[1])/2
    
    def print_area(self):
        super().print_area()

class Retangulo(Poligono):
    def __init__(self,lado_m, lado_M):
        Poligono.__init__(self,[lado_m,lado_M,lado_m,lado_M])

    def calcular_area(self):
        a = self.lados[0] * self.lados[1]
        return a
    
    def print_area(self):
        print("Área =",self.calcular_area())

def perimetro_e_area(poligono: Poligono):
    poligono.print_perimetro()

def main():
#jeito arcaico

    #triangulo = Triangulo(3,4,5)
    
    #triangulo.print_perimetro()

    #triangulo.print_area()

    #retangulo = Retangulo(3,4)

    #retangulo.print_perimetro()

    #retangulo.print_area()

    #triangulo_ret = TrianguloRetangulo(1,1,2)

    #triangulo_ret.print_perimetro()

    #triangulo_ret.print_area()

#jeito bom
    triangulo = Triangulo(3,4,5)
    retangulo = Retangulo(3,4)
    triangulo_ret = TrianguloRetangulo(1,1,2)
    poligonos = [triangulo,retangulo,triangulo_ret]

    for poligono in poligonos:
        poligono.print_perimetro()
        poligono.print_area()
        


if __name__ == "__main__":
    main()