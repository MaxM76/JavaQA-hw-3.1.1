public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванович";
        post.passport = "14 45 156546";
        post.phone = "322-33-22";
        post.subscribtion = true;
        post.birthday = new FormDate();
        post.birthday.day = 1;
        post.birthday.month = 5;
        post.birthday.year = 1999;
    }
}