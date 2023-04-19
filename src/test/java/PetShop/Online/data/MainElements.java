package PetShop.Online.data;

public enum MainElements {
    CATS ("Кошки"),
    DOGS ("Собаки"),
    KITTENS_PUPPIES ("Котята и щенки"),
    OTHERS ("Другие питомцы"),
    VETS ("Вет.аптека"),
    SALES ("Акции");

    private String title;

    MainElements (String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "MainElements{" +
                "title='" + title + '\'' +
                '}';
    }
}
