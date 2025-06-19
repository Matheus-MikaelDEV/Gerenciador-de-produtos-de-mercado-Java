package application;

import enties.Product;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Progrma de gerencair produtos de um mercado.");

        int option = 0;
        List<Product> product = new ArrayList();

        do {
            System.out.println("-----------------");
            System.out.println("[1] Cadastrar produto\n[2] Listar produtos\n[3] Remover produto\n[4] Alterar dados do produto\n[5] Sair");
            System.out.print("Opção: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("-----------------");
                    System.out.println("Cadastrar produto");

                    System.out.print("Nome do produto: ");
                    String name = sc.nextLine();
                    System.out.print("Preço do produto: ");
                    Double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Quantidade do produto: ");
                    Integer quantity = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Data de validade do produto (dd/MM/yyyy): ");
                    String dateString = sc.nextLine();

                    LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    product.add(new Product(name, price, quantity, date));

                    System.out.println("Produto cadastrado com sucesso!");
                    Collections.sort(product, Comparator.comparing(Product::getName));
                    break;
                case 2:
                    System.out.println("-----------------");
                    System.out.println("Listar produtos");

                    if (product.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        int i = 1;
                        for (Product p : product) {
                            System.out.println("\nProduto " + i + ":");
                            System.out.println("Nome: " + p.getName());
                            System.out.println("Preço: R$" + p.getPrice());
                            System.out.println("Quantidade: " + p.getQuantity());
                            System.out.println("Data de validade: " + p.getDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                            System.out.println("Total por produto: R$" + (p.getPrice() * p.getQuantity()));
                            if (p.getDate().isBefore(LocalDate.now())){
                                System.out.println("Produto vencido!");
                            } else {
                                System.out.println("Produto dentro do prazo de validade.");
                            }
                            i++;
                        }
                        i = 1;
                    }
                    break;
                case 3:
                    System.out.println("-----------------");
                    System.out.println("Remover produto");

                    if (product.isEmpty()) {
                        System.out.println("\nNenhum produto cadastrado.");
                    } else {
                        System.out.print("\nDigite o nome do produto a ser removido: ");
                        String removeName = sc.nextLine();

                        for (Product p : product) {
                            if (p.getName().equalsIgnoreCase(removeName)) {
                                product.remove(p);
                                System.out.println("Produto removido com sucesso!");
                                break;
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("-----------------");
                    System.out.println("Alterar dados do produto.");
                    if (product.isEmpty()) {
                        System.out.println("\nNenhum produto cadastrado.");
                        break;
                    } else {
                        int option2 = 0;
                        do {
                            System.out.println("\nQual as aspecto do produto que deseja alterar?");
                            System.out.println("[1] Nome\n[2] Preço\n[3] Quantidade\n[4] Data de validade\n[5] Sair");
                            System.out.print("Opção: ");
                            option2 = sc.nextInt();
                            sc.nextLine();

                            switch (option2) {
                                case 1:
                                    System.out.println("\nDigite o nome do produto a ser alterado: ");
                                    String oldName = sc.nextLine();
                                    for (Product p : product) {
                                        if (p.getName().equalsIgnoreCase(oldName)) {
                                            System.out.print("Digite o novo nome do produto: ");
                                            String newName = sc.nextLine();

                                            p.setName(newName);

                                            System.out.println("Nome alterado com sucesso!");
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("\nDigite o nome do produto a ser alterado: ");
                                    String nameToChangePrice = sc.nextLine();
                                    for (Product p : product) {
                                        if (p.getName().equalsIgnoreCase(nameToChangePrice)) {
                                            System.out.print("Digite o novo preço do produto: ");
                                            Double newPrice = sc.nextDouble();
                                            sc.nextLine();

                                            p.setPrice(newPrice);

                                            System.out.println("Preço alterado com sucesso!");
                                            break;
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("\nDigite o nome do produto a ser alterado: ");
                                    String nameToChangeQuantity = sc.nextLine();
                                    for (Product p : product) {
                                        if (p.getName().equalsIgnoreCase(nameToChangeQuantity)) {
                                            System.out.print("Digite a nova quantidade do produto: ");
                                            Integer newQuantity = sc.nextInt();
                                            sc.nextLine();

                                            p.setQuantity(newQuantity);

                                            System.out.println("Quantidade alterada com sucesso!");
                                            break;
                                        }
                                    }
                                    break;
                                case 4:
                                    System.out.println("\nDigite o nome do produto a ser alterado: ");
                                    String nameToChangeDate = sc.next();
                                    for (Product p : product) {
                                        if (p.getName().equalsIgnoreCase(nameToChangeDate)) {
                                            System.out.print("Digite a nova data de validade do produto (dd/MM/yyyy): ");
                                            String newDateString = sc.nextLine();

                                            LocalDate newDate = LocalDate.parse(newDateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                                            p.setDate(newDate);

                                            System.out.println("Data de validade alterada com sucesso!");
                                            break;
                                        }
                                    }
                                    break;
                                case 5:
                                    System.out.println("\nSaindo do menu de alteração de dados do produto.");
                                    break;
                            }
                        } while (option2 != 5);
                    }
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    break;
            }
        } while (option != 5);
    }
}