<a href="/README.md">вернуться к оглавлению</a><br>


<h1>Игральные кубики</h1>
<i>(Время: 1&nbsp;сек. Память: 16 Мб&nbsp;Сложность: 15%)</i>

<p class=text>
Юный математик Матвей интересуется теорией вероятностей, и по этой причине у него всегда есть с собой несколько стандартных шестигранных игральных кубиков. Стандартный шестигранный кубик имеет три противолежащих пары граней, которые размечены таким образом, что напротив грани с числом 1 находится грань с числом 6, напротив грани с числом 2 — грань с числом 5 и напротив грани с числом 3 — грань с числом 4.
</p>
<p class=text>
Анализируя различные игры с шестигранными кубиками, Матвей придумал новую игру. В эту игру играют два игрока, и проходит она следующим образом: первый игрок бросает один или несколько стандартных кубиков (количество кубиков он определяет сам). После этого первому игроку начисляется количество очков, равное сумме чисел, оказавшихся на верхних гранях всех кубиков, а второму игроку — сумма чисел, оказавшихся на нижних гранях этих кубиков. Побеждает тот, кто набрал больше очков.
</p>
<p class=text>
Например, если был брошен один кубик, и на верхней его грани выпало число два, то первый игрок получает два очка, а второй — пять. В свою очередь, если было брошено два кубика и на их верхних гранях выпало по единице, то первый игрок получает также два очка, а второй игрок – двенадцать очков, так как на нижних гранях этих кубиков оказались шестерки.
</p>
<p class=text>
Матвей рассказал об этой игре своему другу, юному информатику Фоме, и они начали играть в неё через Интернет. Поскольку Фома не видит результат броска и не знает, сколько кубиков бросает Матвей как первый игрок, то о набранных каждым игроком очках он узнает только от Матвея. Чтобы проверить достоверность этой информации, Фома решил узнать, какое минимальное и максимальное количество очков мог получить он, как второй игрок, если известно, сколько очков набрал Матвей.
</p>
<p class=text>
Требуется написать программу, которая по количеству очков, набранных первым игроком после броска, определяет наименьшее и наибольшее количество очков, которые может получить второй игрок за этот бросок.
</p>

<h2>Входные данные</h2>

<p class=text>
Входной файл INPUT.TXT содержит одно натуральное число n — количество очков, которые получил первый игрок (n &#8804; 10<sup>10</sup>).
</p>

<h2>Выходные данные</h2>

<p class=text>
В выходной файл OUTPUT.TXT выведите два разделенных пробелом целых числа: минимальное и максимальное количество очков соответственно, которые мог набрать второй игрок при таком броске кубиков.
</p>

<h2>Примеры</h2>

<table>
<tr><th>№</th><th>INPUT.TXT</th><th>OUTPUT.TXT</th></tr>
<tr><td>1</td><td>2</td><td>5 12</td></tr>
<tr><td>2</td><td>36</td><td>6 216</td></tr>
</table>