
update ffb070t 
set 
fissue_amount_unit = 
decode(substr(fissue_amoun, instr(fissue_amoun, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fissue_amount =
to_number(rtrim(substr(fissue_amoun, 0, decode(instr(fissue_amoun, ' '), 0, 100, instr(fissue_amoun, ' ')))))
;

update ffb070t 
set 
fissue_price_unit = 
decode(substr(fissue_pric, instr(fissue_pric, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fissue_price =
to_number(rtrim(substr(fissue_pric, 0, decode(instr(fissue_pric, ' '), 0, 100, instr(fissue_pric, ' ')))))
;

update ffb070t 
set 
fton_sea_fee_equalize_unit = 
decode(substr(fton_sea_fee_equaliz, instr(fton_sea_fee_equaliz, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fton_sea_fee_equalize =
to_number(rtrim(substr(fton_sea_fee_equaliz, 0, decode(instr(fton_sea_fee_equaliz, ' '), 0, 100, instr(fton_sea_fee_equaliz, ' ')))))
;

update ffb070t 
set 
fsee_fee_equalize_unit = 
decode(substr(fsee_fee_equaliz, instr(fsee_fee_equaliz, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fsee_fee_equalize =
to_number(rtrim(substr(fsee_fee_equaliz, 0, decode(instr(fsee_fee_equaliz, ' '), 0, 100, instr(fsee_fee_equaliz, ' ')))))
;

update ffb070t 
set 
fcommission_unit = 
decode(substr(fcommissio, instr(fcommissio, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fcommission =
to_number(rtrim(substr(fcommissio, 0, decode(instr(fcommissio, ' '), 0, 100, instr(fcommissio, ' ')))))
;



select f0 , fissue_amoun, fissue_amount, fissue_amount_unit, fissue_pric, fissue_price, fissue_price_unit, fton_sea_fee_equaliz, fton_sea_fee_equalize, fton_sea_fee_equalize_unit, fsee_fee_equaliz, fsee_fee_equalize, fsee_fee_equalize_unit, fcommissio, fcommission, fcommission_unit from ffb070t 