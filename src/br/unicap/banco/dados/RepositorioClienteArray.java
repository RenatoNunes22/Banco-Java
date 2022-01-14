package br.unicap.banco.dados;
import br.unicap.banco.model.Cliente;

public class RepositorioClienteArray {
	private static final int tam = 5;
    private Cliente[] cliente;
    private int indice;

    public RepositorioClienteArray() {
        indice = 0;
        cliente = new Cliente[tam];

    }

    public void inserir(Cliente C) {
        cliente[indice] = C;
        this.indice++;
    }

    private int procurarIndice(String numero) {
        int i = 0;
        int ind = -1;
        for (Cliente C : cliente) {
            if (C.getCpf().equals(numero)) {
                ind = i;
                break;

            }
            i++;
        }
        return ind;
    }

    public void atualizar(Cliente C) {
        int i = this.procurarIndice(C.getCpf());

        if (i != -1) {
            cliente[i] = C;
        } else {
            System.out.println("Cliente não encontrada");
        }
    }

    public boolean existe(String numero) {
        boolean resp = false;

        int i = this.procurarIndice(numero);
        if (i != -1) {
            resp = true;
        }
        return resp;

    }

    public Cliente procurar(String cpf) {
        Cliente C = null;
        if (this.existe(cpf)) {
            int i = this.procurarIndice(cpf);
            C = cliente[i];
        } else {
            System.out.println("Cliente não existe");
        }
        return C;

    }

    public void remover(String cpf) {
        int i;
        if (this.existe(cpf)) {
            i = this.procurarIndice(cpf);
            cliente[i] = cliente[this.indice - 1];
            cliente[this.indice - 1] = null;
            this.indice--;

        } else {
            System.out.println("Cliente não encontrado");
        }
    }

    public void Exibir() {
        if (indice != 0) {
            for (Cliente P : cliente) {
                System.out.println(P.toString());

            }
        } else {
            System.out.println("Vazia");
            return;
        }
    }
}
