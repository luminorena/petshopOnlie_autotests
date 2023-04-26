# Проект по автоматизации UI тестирования Интернет-магазина petshop.ru

## Содержание

> ➠ [Стек технологий](#technologies)
>
> ➠ [Тест кейсы](#test-cases)
>
> ➠ [Локальный запуск тестов](#run-tests-locally)
>
> ➠ [Удалённый запуск тестов на Jenkins](#run-tests-via-Jenkins)
>
> ➠ [Allure отчётность](#allure-reports)
>
> ➠ [Интеграция с Allure TestOps](#allure-testOps)
>
> ➠ [Интеграция с Atlassian Jira](#atlassian-jira)
>
> ➠ [Уведомления в Telegram](#telegram)

## Стек технологий
### В проекте использованы следующие технологии
Java Gradle IntelliJ IDEA Selenide Selenoid JUnit5 Jenkins Allure Report Allure TestOps Telegram Jira

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://https://qameta.io/"><img src="images/logo/Allure_TO.svg" width="50" height="50"  alt="Allure_TO"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://https://telegram.org/"><img src="images/logo/Telegram.svg" width="50" height="50"  alt="Telegram"/></a>
</p>

## Тест кейсы

 ✓ Проверка открытия главной страницы <br>
 ✓ Проверка поиска по категориям для разных запросов (параметризованные тесты) <br>
 ✓ Проверка наличия меню на сайте <br>
 ✓ Проверка блока данных о компании <br>
 ✓ Проверка работы кнопки 'Магазины' <br>

##  Локальный запуск тестов

Тесты запускаются в терминале командой:
```bash
-Denv=local
```
Запуск Allure отчёта через терминал:
```bash
allure serve build/allure-results
```

##  Удалённый запуск тестов на Jenkins
1. Перейти по ссылке <a target="_blank" href="https://jenkins.autotests.cloud/job/luminorena_18_hw_15/">the project</a>
2. Выбрать пункт в меню **Собрать с параметрами**
3. Изменить параметры запуска или собрать с параметрами по умолчанию
4. Чтобы посмотреть логи сборки, нажать на новую сборку -> вывод консоли
5. Результаты тестирования выводятся в Allure отчётах, чтобы перейти к результатам, нажать на иконки рядом

## Allure отчётность

###  Основная страница

<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/allure_mainpage.png">
</p>

###  Страница с тестами и статистикой

<p align="center">
<img title="Allure Tests" src="images/screens/alluresuites.png">
</p>


## Интеграция с Allure TestOps

### Ручные и автоматизированные тесты
<p align="center">
<img title="Allure Graphics" src="images/screens/testops_cases.png">
</p>

### Dashboard
<p align="center">
<img title="Allure Graphics" src="images/screens/testops_dashboard.png">
</p>

## Интеграция с Atlassian Jira
<p align="center">
<img title="Jira" src="images/screens/jira.png">
</p>

## Уведомления в Telegram

<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/telegram.png" >
</p>
