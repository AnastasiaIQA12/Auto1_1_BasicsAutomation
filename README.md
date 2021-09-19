# Домашнее задание к занятию «1.1. Основы автоматизации»
## Задача №1 - CashbackHacker
### Легенда
Вы участвуете в проекте CashbackHacker - небольшой сервис, который сообщает пользователю о том, сколько ему нужно "докупить" в рамках конкретной траты, чтобы получить максимальное количетство кэшбека. Подробнее: кэшбек начисляется за каждую потраченную полную тысячу рублей, поэтому если вы покупаете что-то на 900 рублей, сервис должен посоветовать вам докупить "ещё чего-нибудь" на 100 рублей.

Код сервиса выглядит следующим образом:
```java
package ru.netology.service;
public class CashbackHackService {
    private final int boundary = 1000;
    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}
```
**Задание:** Cоздать проект на базе Gradle. Выложить полученный проект на GitHub. Подключить Github Actions.

### Легенда
Поскольку вы уже умеете работать с JUnit5 вам поручили провести небольшое исследование, в рамках которого попробовать использовать TestNG и JUnit4 (тот самый пресловутый кейс - попробуем что-то сделать, а потом уже будем принимать решения).
### Часть 1. TestNG
**Задание:** Сделать ветку testng, в которой:

1\. Добавить в зависимости TestNG:
```groovy
dependencies {
    testImplementation 'org.testng:testng:7.1.0'
}
test {
    useTestNG()
}
```
2\. Написать простые автотесты (без параметризации).

### Часть 2. JUnit4
**Задание:** Сделать ветку junit4, в которой:

1\. Добавить в зависимости JUnit:
```groovy
dependencies {
    testImplementation 'junit:junit:4.13'
}
test {
    useJUnit()
}
```
2\. Написать простые автотесты (без параметризации).

**Об ошибках** В сервисе точно есть ошибка, поэтому один из ваших авто-тестов должен падать.

## Задача №2 - JUnit5 и Legacy 
## Легенда
Автотесты - это тоже код и он подвержен тем же проблемам, что и обычный код. Достаточно часто встречается ситуация, когда в вашем проекте достаточно большое "наследие" (legacy) кода автотестов, например, на JUnit4. Но новые тесты хочется писать, используя JUnit5. 

**Задание:** Из ветки junit4 создать ветку junit4-platform, в которой:

1\. Добавить в зависимости JUnit Vintage:
```groovy
dependencies {
    testImplementation 'junit:junit:4.13'
    testRuntimeOnly 'org.junit.vintage:junit-vintage-engine:5.6.2'
}
test {
    useJUnitPlatform()
}
```
2\. Удостовериться, что тесты запускаются.

3\. Добавить в зависимости JUnit Jupiter:
```groovy
dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.6.1'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.6.1'
    testImplementation 'junit:junit:4.13'
    testRuntimeOnly 'org.junit.vintage:junit-vintage-engine:5.6.2'
}
test {
    useJUnitPlatform()
}
```
4\. Написать те же тесты, но с использованием API JUnit Jupiter

5\. Удостовериться, что запускаются и тесты JUnit4, и тесты JUnit Jupiter

6\. Собрать отчёты и запаковать их в zip-архив 

7\. Создать в проекте Issue, к которому приложить отчёты
