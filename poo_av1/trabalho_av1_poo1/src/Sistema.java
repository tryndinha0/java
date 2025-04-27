import java.util.ArrayList;
import java.util.List;

import animal_e_dono.animal.Pet;
import animal_e_dono.dono.Dono;

public class Sistema {
    private List<Dono> donos;
    private List<Pet> pets;

    public Sistema() {
        donos = new ArrayList<>();
        pets = new ArrayList<>();
    }

    // Método para cadastrar dono no sistema
    public void cadastrarDono(Dono dono) {
        donos.add(dono);
        System.out.println("Dono " + dono.getNome() + " cadastrado com sucesso!");
    }

    // Método para cadastrar pet no sistema
    public void cadastrarPet(Pet pet) {
        pets.add(pet);
        System.out.println("Pet " + pet.getNome() + " cadastrado com sucesso!");
    }

    // Método para consultar dono por ID
    public String consultarDono(int id) {
        for (Dono dono : donos) {
            if (dono.getId() == id) {
                return dono.getNome();
            }
        }
        return null; // Retorna null se não encontrar o dono
    }

    // Método para consultar pet por ID
    public Pet consultarPet(int id) {
        for (Pet pet : pets) {
            if (pet.getId() == id) {
                return pet;
            }
        }
        return null; // Retorna null se não encontrar o pet
    }
    public static void main(String[] args) {
    }
}
