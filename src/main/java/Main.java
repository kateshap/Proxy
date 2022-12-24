public class Main {
    public static void main(String[] args) {
        VideoLoader videoLoader = new RuTubeVideoLoaderProxy();
        System.out.println("\nЗагрузка файла в первый раз: ");
        videoLoader.load("https://rutube.ru/video/d96c6b71cfe5f47364c1f0d84a60440f/");

        System.out.println("\nЗагрузка файла во второй раз: ");
        videoLoader.load("https://rutube.ru/video/d96c6b71cfe5f47364c1f0d84a60440f/");
    }
}
