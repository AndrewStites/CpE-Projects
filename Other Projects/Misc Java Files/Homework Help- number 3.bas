rem programmed by: Dhabih Hendershot
rem date: 03/12/15
rem purpose: introduction to arrays


' has an "s" because it signifies that it is the array
' "itemprices" is multidimensional
dim customernames$ (100)
dim subtotals (100)
dim totals (100)

dim discountamounts (100)
dim taxamounts (100)

x = 0
'y = 1
z = 0
'this if pretty much your homework
input "Please enter customer name: "; customername$
cls
'put the input into the loop so it doesn't get wiped out
' the "let x = x + 1" is the counter to allow the loop to proceed

do while customername$ <> ""
'or null

    print "Welcome "; customername$
    input "Please enter 1st item: $"; itemprice1
    input "Please enter 2nd item: $"; itemprice2
    input "Please enter 3rd item: $"; itemprice3
    input "Please enter 4th item: $"; itemprice4

    let subtotal = itemprice1 + itemprice2 + itemprice3 + itemprice4

'discount
       ' if subtotal >= 100 then
       ' discount = .05

    'end if

     '  if subtotal >= 100 then
      '  discount = .05

    'end if

    'if subtotal >= 500 then
     '   discount = .10

    'end if

    'if subtotal >= 1000 then
    '    discount = .15

    'end if

    'if subtotal >= 5000 then
    '    discount = .30

    'end if

    'if subtotal >= 10000 then
    '    discount = .45

    'end if

    discountamount = subtotal * discount
    total = subtotals - discountamount

    let customernames$ (x) = customername$
    let subtotals (x) = subtotal
    let discountamounts (x) = discountamount
    let totals (x) = total
    let x = x + 1

    print ""
    print "Thank you "; customername$; ", your subtotal is $";using("#####.##",subtotal); "."
    print ""

    input "Please enter customer name or press Enter when done: "; customername$
    cls

loop

'---------print of Summary-------------
print "This is the summary report"
print ""
print "Customer Name";
print tab(20);
print "Subtotals";
print tab(40);
'print "Discount";
'print tab(60);
print "Total"

x = x - 1 ' TO GET RID OF THE NULL Enter STEP

for z = z to x step 1
    print customernames$ (z);
    print tab(20);
    print using("#####.##",subtotals (z));
    print tab(40);
    print using("#####.##",discountamounts (z));
    print tab(60);
    print using("#####.##",totals (z))
next z




'input "Please enter the value of the item: $"; itemprice
    'let subtotal =  subtotal + itemprice

    'let y = y + 1


'let customernames$ (x) = customername$
'let itemprices (x,y) = itemprice



'do while itemprice <> null 'Keep looping until someone presses ENTER
    'input "Please enter the value of the item or press ENTER when done: $"; itemprice

    'let subtotal = subtotal + itemprice

    'let y = y + 1

   ' let itemprices (x,y) = itemprice
   'let subtotals (x) = subtotal

'loop

'print "Thank you "; customername$; ", your total is "; subtotal

'print "for next loop output"
'for z = 1 to y step 1
    'print itemprices (x,z)
'next z


end

