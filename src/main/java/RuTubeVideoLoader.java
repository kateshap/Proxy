public class RuTubeVideoLoader implements VideoLoader{
    public RuTubeVideoLoader() { }

    @Override
    public String load(String name) {
        System.out.println("Загрузка файла "+name);
        return name;
    }
}