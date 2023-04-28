def converte3_10(num):
    base10 = 0
    expoente = 0
    while(num != 0):
        base10 += (num%10)*(3**expoente)
        expoente += 1
        num //= 10
        
    return base10
        
        
def converte10_3(num):
    base3 = 0
    casa_decimal = 0
    a = 1
    while(num != 0):
        base3 += num % 3 * (10**casa_decimal)
        casa_decimal += 1
        num //= 3
        
    base3 += a // 3 *(10**(casa_decimal))
        
    return base3

def verifica (tabuleiro):
    tab_horizontal = tabuleiro
    
    a = tab_horizontal % 10
    b = (tab_horizontal//10) % 10
    c = (tab_horizontal//100) % 10
    print(a,b,c)
    if (tab_horizontal % 10 == ((tab_horizontal//10) % 10)) and (tab_horizontal % 10 == ((tab_horizontal//100) % 10)): #xxxxxxABC
        return True
    tab_horizontal //= 1000
    
    if (tab_horizontal % 10 == ((tab_horizontal//10) % 10)) and (tab_horizontal % 10 == ((tab_horizontal//100) % 10)): #xxxDEFxxx
        return True
    tab_horizontal //= 1000
    
    if (tab_horizontal % 10 == (tab_horizontal//10) % 10) and (tab_horizontal % 10 == (tab_horizontal//100) % 10): #HIJxxxxxx
        return True

    tab_vertical = tabuleiro
    if (tab_vertical % 10 == (tab_vertical//1000) % 10) and (tab_vertical % 10 == (tab_vertical//1000000) % 10): #AxxBxxCxx
        return True
    tab_vertical //= 10
    
    if (tab_vertical % 10 == (tab_vertical//1000) % 10) and (tab_vertical % 10 == (tab_vertical//1000000) % 10): #xDxxExxFx
        return True
    tab_vertical //= 10
    
    if (tab_vertical % 10 == (tab_vertical//1000) % 10) and (tab_vertical % 10 == (tab_vertical//1000000) % 10): #xxHxxIxxJ
        return True
    
    
    tab_diagonal = tabuleiro
    if(tab_diagonal % 10 == (tab_diagonal//10000) % 10) and (tab_diagonal % 10 == (tab_diagonal//100000000) % 10):
        return True
    tab_diagonal //= 100
    
    if(tab_diagonal % 10 == (tab_diagonal//100) % 10) and (tab_diagonal % 10 == (tab_diagonal//10000) % 10):
        return True
    
    return False
    
#def jogoVelha():
#    win = 0
#    while (win == 0):
#       rodadas = 0
#       jogador = 0
#       tabuleiro = 0
#        if rodadas % 2 == 0:
#            jogador = 1
#           
#           jogada = int(input("Jogada do JX: "))
#            tabuleiro += (10**jogada) * jogador
#            
#            if tabuleiro == 
#        else:
#            jogador = 2
#            jogada = int(input("Jogada do JO: "))
#            tabuleiro += (10**jogada) * jogador           






def main():
    a = int(input('a = '))
    print(converte3_10(a))
    
    b = int(input('b = '))
    print(converte10_3(b))
    
    x = 101002021      #101
                       #002 
                       #120
    print(verifica(x))
main()