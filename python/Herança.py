class Poligono: #Classe Mãe
    def __init__(self,n_lados):
        self.n = n_lados  #numero de lados
        self.lados = [0 for i in range(n_lados)] #inicializa todos os lados com 0
    
    def le_lados(self):
        for i in range(self.n):
            self.lados[i] = float(input("Digite tamanho do lado: "))
        
    def mostra_lados(self):
        for i in range(self.n):
            print("Lado",i+1,"tem comprimento", self.lados[i])
            
class Triangulo(Poligono): #Classe Filha
    def __init__(self):
        Poligono.__init__(self,3)
    def area(self):
        a,b,c = self.lados
        s = (a+b+c)/2
        area = (s*(s-a)*(s-b)*(s-c)) ** 0.5
        print("Área  =",area)
        
class TrianguloRetangulo (Triangulo): #Subclasse da Subclasse Triangulo
    def éTrianguloRetangulo(self):
        
            
class Retangulo(Poligono):
    def __init__(self):
        Poligono.__init__(self,4)
            

#pent = Poligono(5)
#pent.le_lados()
#pent.mostra_lados()

tri = Triangulo()
tri.le_lados()
tri.area()