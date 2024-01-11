<a href="/README.md">вернуться к оглавлению</a><br>

<h1>Кондиционер</h1>
<i>(Время: 1&nbsp;сек. Память: 16 Мб&nbsp;Сложность: 12%)</i>

<p class=text>
В офисе, где работает программист Петр, установили кондиционер нового типа. Этот кондиционер отличается особой простотой в управлении. У кондиционера есть всего лишь два управляемых параметра: желаемая температура и режим работы.
</p>
<p class=text>
Кондиционер может работать в следующих четырех режимах:
</p>
<ul>
<li>«freeze» — охлаждение. В этом режиме кондиционер может только уменьшать температуру. Если температура в комнате и так не больше желаемой, то он выключается.</li>
<li>«heat» — нагрев. В этом режиме кондиционер может только увеличивать температуру. Если температура в комнате и так не меньше желаемой, то он выключается.</li>
<li>«auto» — автоматический режим. В этом режиме кондиционер может как увеличивать, так и уменьшать температуру в комнате до желаемой.</li>
<li>«fan» — вентиляция. В этом режиме кондиционер осуществляет только вентиляцию воздуха и не изменяет температуру в комнате.</li>
</ul>
<p class=text>
Кондиционер достаточно мощный, поэтому при настройке на правильный режим работы он за час доводит температуру в комнате до желаемой.
</p>
<p class=text>
Требуется написать программу, которая по заданной температуре в комнате t<sub>room</sub>, установленным на кондиционере желаемой температуре t<sub>cond</sub> и режиму работы определяет температуру, которая установится в комнате через час.
</p>

<h2>Входные данные</h2>

<p class=text>
Первая строка входного файла INPUT.TXT содержит два целых числа t<sub>room</sub> и t<sub>cond</sub>, разделенных ровно одним пробелом (–50 &#8804; t<sub>room</sub> &#8804; 50, –50 &#8804; t<sub>cond</sub> &#8804; 50).
</p>
<p class=text>
Вторая строка содержит одно слово, записанное строчными буквами английского алфавита — режим работы кондиционера, как указано выше.
</p>

<h2>Выходные данные</h2>

<p class=text>
Выходной файл OUTPUT.TXT должен содержать одно целое число — температуру, которая установится в комнате через час.
</p>

<h2>Примеры</h2>

<table>
<tr><th>№</th><th>INPUT.TXT</th><th>OUTPUT.TXT</th></tr>
<tr><td>1</td><td>10 20<br>heat</td><td>20</td></tr>
<tr><td>2</td><td>10 20<br>freeze</td><td>10</td></tr>
</table>