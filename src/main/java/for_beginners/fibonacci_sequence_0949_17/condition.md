<a href="/README.md">вернуться к оглавлению</a><br>



<h1>Фибоначчиева последовательность</h1>
<i>(Время: 1&nbsp;сек. Память: 16 Мб&nbsp;Сложность: 17%)</i>

<p class=text>
Последовательность чисел a<sub>1</sub>, a<sub>2</sub>, …, a<sub>i</sub>,… называется Фибоначчиевой, если для всех i &#8805; 3 верно, что a<sub>i</sub>=a<sub>i-1</sub>+a<sub>i-2</sub>, то есть каждый член последовательности (начиная с третьего) равен сумме двух предыдущих.
</p>
<p class=text>
Ясно, что, задавая различные числа a<sub>1</sub> и a<sub>2</sub>, мы можем получать различные такие последовательности, и любая Фибоначчиева последовательность однозначно задается двумя своими первыми членами.
</p>
<p class=text>
Будем решать обратную задачу. Вам будет дано число n и два члена последовательности: a<sub>n</sub> и a<sub>n+1</sub>. Вам нужно написать программу, которая по их значениям найдет a<sub>1</sub> и a<sub>2</sub>.
</p>

<h2>Входные данные</h2>

<p class=text>
Входной файл INPUT.TXT содержит число n и значения двух членов последовательности: a<sub>n</sub> и a<sub>n+1</sub> (1 &#8804; n &#8804; 30, члены последовательности от первого до (n+1)-го — целые числа, по модулю не превышающие 2&#215;10<sup>9</sup>).
</p>

<h2>Выходные данные</h2>

<p class=text>
В выходной файл OUTPUT.TXT выведите два числа — значения первого и второго членов этой последовательности.
</p>

<h2>Пример</h2>

<table class=main cellpadding=2 cellspacing=1>
<tr><th width=30>№</th><th>INPUT.TXT</th><th>OUTPUT.TXT</th></tr>
<tr class=white2><td align=center>1</td><td valign=top>4 3 5</td><td valign=top>1 1</td></tr>
</table>