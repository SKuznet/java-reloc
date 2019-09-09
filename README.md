# java-reloc

## hw1 - Сборник задач Златопольского - 3.9 3.13 3.23
## hw2 - Сборник задач Златопольского - 9.2, 9.16., 9.21., 9.43., 9.62., 9.74., 9.78., 9.84.
OCA - 101p. - 119p.

## hw3 - Сборник задач Златопольского - 11.18., 11.29., 11.36., 11.52. -Все элементы, содержит цифру 4, уменьшить вдвое.

## hw4 - OCA - 129 p - 138p
OCP - 124p - 132p

## hw5 - OCP 132-134 p

## hw6 - OCA 234p - 278p

```java
public class Cat extends Animal implements AniI, CatI {
    private String name;

    public Cat(String name) {
        this.name = name;
        super.name = name;
    }

    public static void main(String[] args) {
        Animal cat = new Cat("bars");
        Cat cat2 = new Cat("bars");
        System.out.println(cat.name);
        System.out.println(cat2.name);
    }
}
```