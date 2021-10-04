#include <iostream>
using namespace std;

class Padre{
private:
	void PasoBase1(){
		cout<<"Padre: Paso Base 1. Este paso no se puede modificar"<<endl;
	}
	void PasoBase2(){
		cout<<"Padre: Paso Base 2. Este paso no se puede modificar"<<endl;
	}
	virtual void PasoOpcional1()const{};
	virtual void PasoRequerido1()const=0;
	virtual void PasoRequerido2()const=0;
public:
	void TemplateMethod(){
		PasoBase1();
		PasoRequerido1();
		PasoBase2();
		PasoRequerido2();
		PasoOpcional1();
	}
};

class Hija1 : public Padre{
private:
	void PasoRequerido1()const override{
		cout<<"Clase Hija1: paso requerido 1 implementado."<<endl;
	}
	void PasoRequerido2()const override{
		cout<<"Clase Hija1: paso requerido 2 implementado."<<endl;
	}
};

class Hija2 : public Padre{
private:
	void PasoRequerido2()const override{
		cout<<"Clase Hija2: paso requerido 2 implementado."<<endl;
	}
	void PasoRequerido1()const override{
		cout<<"Clase Hija2: paso requerido 1 implementado."<<endl;
	}
	void PasoOpcional1()const override{
		cout<<"Clase Hija2: paso opcional 1 implementado."<<endl;
	}
};

void Cliente(Padre *clase){
	clase->TemplateMethod();
}

int main(int argc, char *argv[]) {
	Hija1 *hija1 = new Hija1;
	Hija2 *hija2 = new Hija2;
	cout<<"Cliente con implementacion de la clase Hija1"<<endl<<endl;
	Cliente(hija1);
	cout<<endl<<endl;
	cout<<"Mismo cliente con implementacion de la clase Hija12"<<endl<<endl;
	Cliente(hija2);
	cout<<endl<<endl;
	return 0;
}

