
update ffb040t 
set 
funload_delay_fee_unit = 
decode(substr(funload_delay_fe, instr(funload_delay_fe, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
funload_delay_fee =
to_number(rtrim(substr(funload_delay_fe, 0, decode(instr(funload_delay_fe, ' '), 0, 100, instr(funload_delay_fe, ' ')))))
;

update ffb040t 
set 
funload_transport_adjust_unit = 
decode(substr(funload_transport_adjus, instr(funload_transport_adjus, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
funload_transport_adjust =
to_number(rtrim(substr(funload_transport_adjus, 0, decode(instr(funload_transport_adjus, ' '), 0, 100, instr(funload_transport_adjus, ' ')))))
;

update ffb040t 
set 
fspeed_delay_fee_unit = 
decode(substr(fspeed_delay_fe, instr(fspeed_delay_fe, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fspeed_delay_fee =
to_number(rtrim(substr(fspeed_delay_fe, 0, decode(instr(fspeed_delay_fe, ' '), 0, 100, instr(fspeed_delay_fe, ' ')))))
;

update ffb040t 
set 
fdeposit_fee_unit = 
decode(substr(fdeposit_fe, instr(fdeposit_fe, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fdeposit_fee =
to_number(rtrim(substr(fdeposit_fe, 0, decode(instr(fdeposit_fe, ' '), 0, 100, instr(fdeposit_fe, ' ')))))
;

update ffb040t 
set 
fdeclare_customs_fee_unit = 
decode(substr(fdeclare_customs_fe, instr(fdeclare_customs_fe, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fdeclare_customs_fee =
to_number(rtrim(substr(fdeclare_customs_fe, 0, decode(instr(fdeclare_customs_fe, ' '), 0, 100, instr(fdeclare_customs_fe, ' ')))))
;

update ffb040t 
set 
fvalue_added_tax_unit = 
decode(substr(fvalue_added_ta, instr(fvalue_added_ta, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fvalue_added_tax =
to_number(rtrim(substr(fvalue_added_ta, 0, decode(instr(fvalue_added_ta, ' '), 0, 100, instr(fvalue_added_ta, ' ')))))
;

update ffb040t 
set 
fcustoms_tax_equalize_unit = 
decode(substr(fcustoms_tax_equaliz, instr(fcustoms_tax_equaliz, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fcustoms_tax_equalize =
to_number(rtrim(substr(fcustoms_tax_equaliz, 0, decode(instr(fcustoms_tax_equaliz, ' '), 0, 100, instr(fcustoms_tax_equaliz, ' ')))))
;



select f0 , funload_delay_fe, funload_delay_fee, funload_delay_fee_unit, funload_transport_adjus, funload_transport_adjust, funload_transport_adjust_unit, fspeed_delay_fe, fspeed_delay_fee, fspeed_delay_fee_unit, fdeposit_fe, fdeposit_fee, fdeposit_fee_unit, fdeclare_customs_fe, fdeclare_customs_fee, fdeclare_customs_fee_unit, fvalue_added_ta, fvalue_added_tax, fvalue_added_tax_unit, fcustoms_tax_equaliz, fcustoms_tax_equalize, fcustoms_tax_equalize_unit from ffb040t 