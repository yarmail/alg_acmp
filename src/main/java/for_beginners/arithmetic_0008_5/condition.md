<a href="/README.md">вернуться к оглавлению</a><br>

<h1>Арифметика</h1>
<i>(Время: 1&nbsp;сек. Память: 16 Мб&nbsp;Сложность: 5%)</i>

<p>
В прошлом году Вася пошел в школу и научился считать. В этом году он изучил таблицу умножения и теперь умеет перемножать любые числа от 1 до 10 без ошибок. Друг Петя рассказал ему про системы счисления, отличные от десятичной. В частности, про двоичную, восьмеричную и даже шестнадцатеричную. Теперь Вася без труда (но уже с помощью листка и ручки) может перемножать числа от 1 до 10 и в этих системах, используя перевод из нестандартной системы в десятичную и обратно из десятичной. Например, если Васе нужно перемножить числа 101 и 1001 в двоичной системе, то он сначала эти числа переводит в десятичное представление следующим образом:
</p>
<p>(101)<sub>2</sub>=1*2<sup>2</sup>+0*2<sup>1</sup>+1*2<sup>0</sup>=4+0+1=5</p>
<p>(1001)<sub>2</sub>=1*2<sup>3</sup>+0*2<sup>2</sup>+0*2<sup>1</sup>+1*2<sup>0</sup>=8+0+0+1=9</p>
<p>
После чего перемножение чисел 5 и 9 Вася с легкостью производит в десятичной системе счисления в уме и получает число 45. Далее производится перевод из десятичной системы счисления в двоичную. Для этого Вася делит число 45 на 2 (порядок системы счисления), запоминая остатки от деления, до тех пор пока в результате не останется число 0:
</p>
<p>
Ответ составляется из полученных остатков от деления путем их записи в обратном порядке. Таким образом Вася получает результат: (101)<sub>2</sub> * (1001)<sub>2</sub> = (101101)<sub>2</sub>. Но теперь Вася изучает таблицу умножения чисел от 1 до 100 в десятичной системе счисления, а поскольку запомнить такую таблицу очень сложно, то Васе придется очень долго ее зубрить. Составьте для Васи программу, которая поможет ему проверять свои знания.
</p>

<h2>Входные данные</h2>

<p>
Во входном файле INPUT.TXT записаны три натуральных числа A, B и C через пробел. Числа A и B &le; 10<sup>2</sup>, а C &le; 10<sup>6</sup>.
</p>

<h2>Выходные данные</h2>

<p>
В выходной файл нужно вывести YES в том случае, если A*B=C и вывести NO в противном случае.
</p>

<h2>Примеры</h2>

<table>
<tr><th>№</th><th>INPUT.TXT</th><th>OUTPUT.TXT</th></tr>
<tr><td>1</td><td>8 54 432</td><td>YES</td></tr>
<tr><td>2</td><td>16 19 777</td><td>NO</td></tr>
</table>