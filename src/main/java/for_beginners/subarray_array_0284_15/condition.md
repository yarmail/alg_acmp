<a href="/README.md">вернуться к оглавлению</a><br>

<h1>Подмассив массива</h1>
<i>(Время: 1&nbsp;сек. Память: 16 Мб&nbsp;Сложность: 15%)</i>

<p class=text>
Пусть задан массив целых чисел а<sub>1</sub>, а<sub>2</sub>, ..., а<sub>n</sub>. Назовем его подмассивом f(i,j) массив, составленный из чисел массива а<sub>i</sub>, a<sub>i+1</sub>,..., a<sub>j-1</sub>, a<sub>j</sub>. Напишите программу, которая будет выводить подмассивы массива a.
</p>

<h2>Входные данные</h2>

<p class=text>
Первая строка входного файла INPUT.TXT содержит число n (1 &le; n &le; 1000) - количество элементов в массиве а. Во второй строке содержатся числа a<sub>1</sub>, a<sub>2</sub>, … , а<sub>n</sub> разделенные пробелом. Все а<sub>i</sub> находятся в диапазоне от -2<sup>31</sup> до 2<sup>31</sup> - 1. В третьей строке находится m (1 &le; m &le; 100) — количество подмассивов, которые необходимо вывести. Следующие m строк содержат пары чисел i<sub>k</sub>, j<sub>k</sub> (1 &le; i<sub>k</sub> &le; j<sub>k</sub> &le; n).
</p>

<h2>Выходные данные</h2>

<p class=text>
В выходной файл OUTPUT.TXT для каждой пары (i<sub>k</sub>,j<sub>k</sub>) в отдельной строке выведите подмассив f(i<sub>k</sub>,j<sub>k</sub>).
</p>

<h2>Пример</h2>

<table class=main cellpadding=2 cellspacing=1>
<tr><th width=30>№</th><th>INPUT.TXT</th><th>OUTPUT.TXT</th></tr>
<tr class=white2><td align=center>1</td><td valign=top>6<br> 
1 2 3 4 5 6<br>
5<br>
1 1<br>
2 6<br>
3 4<br>
5 6<br>
2 4
</td><td valign=top>1<br>
2 3 4 5 6<br>
3 4<br>
5 6<br>
2 3 4
</td></tr>
</table>