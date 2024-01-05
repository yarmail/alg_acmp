<a href="/README.md">вернуться к оглавлению</a><br>

<h1>Пятью пять - двадцать пять!</h1>
<i>(Время: 1&nbsp;сек. Память: 16 Мб&nbsp;Сложность: 8%)</i>
<p class=text>
Вася и Петя учатся в школе в одном классе. Недавно Петя поведал Васе о хитром способе возведения в квадрат натуральных чисел, оканчивающихся на цифру 5. Теперь Вася может с легкостью возводить в квадрат двузначные (и даже некоторые трехзначные) числа, оканчивающиеся на 5. Способ заключается в следующем: для возведения в квадрат числа, оканчивающегося на 5 достаточно умножить число, полученное из исходного вычеркиванием последней пятерки на следующее по порядку число, затем остается лишь приписать «25» к получившемуся результату справа. Например, для того, чтобы возвести число 125 в квадрат достаточно 12 умножить на 13 и приписать 25, т.е. приписывая к числу 12*13=156 число 25, получаем результат 15625, т.е. 125<sup>2</sup>=15625. Напишите программу, возводящую число, оканчивающееся на 5, в квадрат для того, чтобы Вася смог проверить свои навыки.</p>

<h2>Входные данные</h2>

<p class=text>
В единственной строке входного файла INPUT.TXT записано одно натуральное число А, оканчивающееся на цифру 5, не превышающее 4*10<sup>5</sup>.
</p>

<h2>Выходные данные</h2>
<p class=text>
В выходной файл OUTPUT.TXT выведите одно натуральное число - A<sup>2</sup> без лидирующих нулей.
</p>

<h2>Примеры</h2>

<table>
<tr><th>№</th><th>INPUT.TXT</th><th>OUTPUT.TXT</th></tr>
<tr><td>1</td><td>5</td><td>25</td></tr>
<tr><td>2</td><td>75</td><td>5625</td></tr>
<tr><td>3</td><td>4255</td><td>18105025</td></tr>
</table>