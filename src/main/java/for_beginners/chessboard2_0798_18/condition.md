<a href="/README.md">вернуться к оглавлению</a><br>

<h1>Шахматная доска - 2</h1>
<i>(Время: 1&nbsp;сек. Память: 16 Мб&nbsp;Сложность: 18%)</i><br>

<img src=pic.png>
<p class=text>
Аня разделила доску размера m &#215; n на клетки размера 1&#215;1 и раскрасила их в черный и белый цвет в шахматном порядке. Васю заинтересовал вопрос: клеток какого цвета получилось больше – черного или белого. 
</p>
<p class=text>
Для того чтобы выяснить это, он спросил у Ани, в какой цвет она раскрасила j-ю клетку в i-м ряду доски. По этой информации Вася попытался  определить, клеток какого цвета на доске больше.
</p>
<p class=text>
Требуется написать программу, которая по размерам доски и цвету j-й клетки в i-м ряду определит, клеток какого цвета на доске больше — черного или белого.
</p>

<h2>Входные данные</h2>

<p class=text>
Входной файл INPUT.TXT содержит пять целых чисел: m, n, i, j и c (1 &#8804; m, n &#8804; 10<sup>9</sup>, 1 &#8804; i &#8804; m, 1 &#8804; j &#8804; n, с = 0 или с = 1). Значение c = 0 означает, что j-я клетка в i-м ряду доски раскрашена в черный цвет, а значение c = 1 – в белый цвет.
</p>

<h2>Выходные данные</h2>

<p class=text>
В выходной файл OUTPUT.TXT выведите одно из трех слов:
</p>
<ul>
<li>black, если черных клеток на доске больше,</li>
<li>white, если белых клеток на доске больше,</li>
<li>equal, если черных и белых клеток на доске поровну.</li>
</ul>

<h2>Примеры</h2>

<table>
<tr><th width=30>№</th><th>INPUT.TXT</th><th>OUTPUT.TXT</th></tr>
<tr class=white2><td align=center>1</td><td valign=top>3 5 1 1 0</td><td valign=top>black</td></tr>
<tr class=white2><td align=center>2</td><td valign=top>3 5 2 1 0</td><td valign=top>white</td></tr>
<tr class=white2><td align=center>3</td><td valign=top>4 4 1 1 1</td><td valign=top>equal</td></tr>
</table>