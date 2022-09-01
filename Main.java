public class Main {
    public static void main (String[] args){
        Worker FFF = new Worker();
        Reader[] READ = new Reader[]{
                new posetitel(),
                FFF
        };
        for (Reader reader : READ) {
            reader.Take();
        }
        System.out.println("АДМИНИСТРАТОР");
        Administrator[] administrators = new Administrator[]{
                new Owner(),
                FFF
        };
        for (Administrator administrator : administrators) {
            administrator.Controls();
        }
    }
}class posetitel implements Reader {
    @Override
    public void Take() {
        System.out.println("Читатель берет и возвращает книги");
    }
}
interface Reader{
    public void Take();
}
class Worker implements Reader, Librarian, Administrator{

    @Override
    public void Take() {
        System.out.println("Читатель  берет и возвращает книги");
    }

    @Override
    public void Orders() {
        System.out.println("Заказывает книги");
    }

    @Override
    public void Controls() {
        System.out.println("Находит и выдает книги и уведомляет о просрочках времени возврата.");
    }
}
interface Librarian{
    public void Orders();
}
class Owner implements TF, Administrator {
    @Override
    public void Delivers() {
        System.out.println("Приносит книги в библиотеку.");
    }

    @Override
    public void Controls() {
        System.out.println("Находит и выдает книги и уведомляет о просрочках времени возврата.");
    }
}
interface Administrator {
    public void Controls();
}interface TF{
    public void Delivers();
}
