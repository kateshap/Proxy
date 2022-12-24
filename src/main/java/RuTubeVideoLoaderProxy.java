import java.util.ArrayList;

class RuTubeVideoLoaderProxy implements VideoLoader {

    private RuTubeVideoLoader ruTubeVideoLoader =new RuTubeVideoLoader();
    ArrayList<String> list = new ArrayList<String>();

    @Override
    public String load(String name) {
        if(list.indexOf(name) == -1) {
            list.add(ruTubeVideoLoader.load(name));
        }
        System.out.println("Загрузка файла с помощью кеширования " + name);
        return list.get(list.indexOf(name));
    }

}