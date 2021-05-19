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