
import java.util.Scanner;

import java.util.ArrayList;

public class Main {
    
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String command;
        ArrayList<User> customer = new ArrayList<User>();
        ArrayList<Movie> movies = new ArrayList<Movie>();
        command = input.next();
        while(!(command.equals("END"))){
            if(command.equals("CreateUser")){
                String nama = input.next();
                int balance = input.nextInt();
                User akun = new User(nama,balance);
                customer.add(akun);
            }
            else if(command.equals("Register")){
                String nama = input.next();
                String tSubs = input.next();
                
                for(User user:customer){
                    if(user.getUsername().equals(nama)){
                        if(tSubs.equals("Free")){
                            Subscription subs = new FreeSubscription();
                            user.setSubscription(subs);
                            break;
                        }else if(tSubs.equals("Premium") && user.getBalance()>169900){
                            Subscription subs = new PremiumSubscription();
                            user.setSubscription(subs);
                            break;
                        }else{
                            Subscription subs = new FreeSubscription();
                            user.setSubscription(subs);
                            break;
                        }
                    }
                }
            }else if(command.equals("Bill")){
                for(User user:customer){
                    boolean cukup = user.bill();
                    if(!cukup){
                        Subscription subs2 = new FreeSubscription();
                        user.setSubscription(subs2);
                    }
                }
            }else if(command.equals("AddBalance")){
                String nama = input.next();
                int duit = input.nextInt();
                for(User user:customer){
                    if(user.getUsername().equals(nama)){
                        user.addBalance(duit);
                        break;
                    }
                }
            }else if(command.equals("AddMovie")){
                String nama = input.next();
                String tipe = input.next();
                if(tipe.equals("HDMovie")){
                    Movie film = new HDMovie(nama);
                    movies.add(film);
                }else if(tipe.equals("UltraHDMovie")){
                    Movie film = new UltraHDMovie(nama);
                    movies.add(film);
                }else{
                    System.out.println("Input salah");
                }
            }else if(command.equals("Watch")){
                String uname = input.next();
                String mname = input.next();
                for(User user:customer){
                    if(user.getUsername().equals(uname)){
                        for(Movie film:movies){
                            if(film.getName().equals("mname")){
                                if(film.getType().equals("UltraHDMovie") && user.getSubscription().equals("Free")){
                                    System.out.println("Kamu perlu Premium Subscription untuk menonton ini");
                                    break;
                                }else{
                                    System.out.println("Selamat menonton"+mname);
                                    break;
                                }
                            }
                        }
                    }
                }
                
            }else if(command.equals("PrintInfoMovie")){
                for(Movie film:movies){
                    System.out.println("Judul Film: "+film.getName());
                    System.out.println("Tipe Film: "+film.getType());
                }
            }else if(command.equals("PrintInfoUser")){
                for(User akun:customer){
                    System.out.println("Nama: "+akun.getUsername());
                    System.out.println("Jenis: "+akun.getSubscription());
                    System.out.println("saldo: "+akun.getBalance());
                }
            }else if(command.equals("END")){
                System.out.println("Thank You");
            }else{
                System.out.println("Tidak Valid");
            }
        }

    }
}