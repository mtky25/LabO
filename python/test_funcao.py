#arquivos de teste devem conter prefixo test_seila.py para funcionar como teste
import funcao



def teste_funcao0(): #funcao de teste deve ter prefixo test_ para que seja reconhecida pelo pytest
    assert funcao.cubo(3) == 5

def teste_funcao1():
    assert funcao.cubo(3) == 27
    
def teste_funcao2():
    assert funcao.cubo(4) == 3