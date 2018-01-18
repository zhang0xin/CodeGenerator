
update ffb060t 
set 
fcontract_money_unit = 
decode(substr(fcontract_mone, instr(fcontract_mone, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fcontract_money =
to_number(rtrim(substr(fcontract_mone, 0, decode(instr(fcontract_mone, ' '), 0, 100, instr(fcontract_mone, ' ')))))
;



select f0 , fcontract_mone, fcontract_money, fcontract_money_unit from ffb060t 