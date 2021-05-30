I) LoginPage 
- MODULE "Registration"
- Priority "high"
- Smoke

а) 
1.0ткрыть страницу - https://www.saucedemo.com
2.Ввести логин
3.Ввести пароль
4.Нажать LOGIN
5.Перешли на страницу с товаром

б)
1.0ткрыть страницу - https://www.saucedemo.com
2.Не вносить логин
3.Не вносить пароль
4.Нажать LOGIN
5.На экране отобразиться сообщение: "Epic sadface: Username is required"

в)
1.0ткрыть страницу - https://www.saucedemo.com
2.Ввести логин
3.Не вносить пароль
4.Нажать LOGIN
5.На экране отобразиться сообщение: "Epic sadface: Password is required"

г)
1.0ткрыть страницу - https://www.saucedemo.com
2.Не вносить логин
3.Ввести пароль
4.Нажать LOGIN
5.На экране отобразиться сообщение: "Epic sadface: Username is required"

д)
1.0ткрыть страницу - https://www.saucedemo.com
2.Ввести неверный логин
3.Ввести пароль
4.Нажать LOGIN
5.На экране отобразиться сообщение: "Epic sadface: Username and password do not match any user in this service"

е)
1.0ткрыть страницу - https://www.saucedemo.com
2.Ввести логин
3.Ввести неверный пароль
4.Нажать LOGIN
5.На экране отобразиться сообщение: "Epic sadface: Username and password do not match any user in this service"

II) CartPage
- MODULE "Purchase of goods"
- Priority "high"
- Smoke

1.0ткрыть страницу - https://www.saucedemo.com
2.Ввести логин
3.Ввести пароль
4.Нажать LOGIN
5.Перешли на страницу с товаром
6.Выбрать товар - нажать ADD TO CART
7.Перейти в карзину
8.Проверить количество выбранного товара одного вида.

HW-14
Команда для обновления версии
mvn versions:update-parent versions:update-properties
[INFO] -----------------------< org.example:Saucedemo >------------------------
[INFO] Building Saucedemo 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- versions-maven-plugin:2.8.1:update-parent (default-cli) @ Saucedemo ---
[INFO] Project does not have a parent
[INFO]
[INFO] --- versions-maven-plugin:2.8.1:update-properties (default-cli) @ Saucedemo ---
[INFO] artifact io.github.bonigarcia:webdrivermanager: checking for updates from central
[INFO] Major version changes allowed
[INFO] Updated ${selenium-java.version} from 3.141.59 to 4.0.0-beta-3
[INFO] Major version changes allowed
[INFO] Updated ${testng.vertion} from 7.1.0 to 7.4.0
[INFO] Major version changes allowed
[INFO] Updated ${webdrivermanager.vertion} from 4.4.1 to 4.4.3
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.234 s
[INFO] Finished at: 2021-05-30T21:31:54+03:00
[INFO] ------------------------------------------------------------------------

Немного настораживает сообщение
Recompile with -Xlint:deprecation for details.
(javac -Xlint:unchecked)

mvn clean test
Results :

Tests run: 8, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  41.504 s
[INFO] Finished at: 2021-05-30T22:09:14+03:00
[INFO] ------------------------------------------------------------------------

mvn -Dtest=CartTest test
mvn -Dtest=LoginTest#checkLoginAndPasswordTest test
mvn -Dtest=ProductsTest#checkAllButtonsAddToCartTest test
mvn -Dtest=LoginTest#checkLoginAndPasswordZerroTest+checkLoginZerroAndPasswordTest test

mvn -Dtest=CheckoutTest -Dfirstname=Yuri -Dlastname=Protasov -Dcode=password test