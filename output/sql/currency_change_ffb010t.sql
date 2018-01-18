
update ffb010t 
set 
fsettlement_price_unit = 
decode(substr(fsettlement_pric, instr(fsettlement_pric, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fsettlement_price =
to_number(rtrim(substr(fsettlement_pric, 0, decode(instr(fsettlement_pric, ' '), 0, 100, instr(fsettlement_pric, ' ')))))
;

update ffb010t 
set 
fship_settlement_price_unit = 
decode(substr(fship_settlement_pric, instr(fship_settlement_pric, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fship_settlement_price =
to_number(rtrim(substr(fship_settlement_pric, 0, decode(instr(fship_settlement_pric, ' '), 0, 100, instr(fship_settlement_pric, ' ')))))
;

update ffb010t 
set 
flc_first_fee_unit = 
decode(substr(flc_first_fe, instr(flc_first_fe, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
flc_first_fee =
to_number(rtrim(substr(flc_first_fe, 0, decode(instr(flc_first_fe, ' '), 0, 100, instr(flc_first_fe, ' ')))))
;

update ffb010t 
set 
ffuture_accrual_unit = 
decode(substr(ffuture_accrua, instr(ffuture_accrua, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
ffuture_accrual =
to_number(rtrim(substr(ffuture_accrua, 0, decode(instr(ffuture_accrua, ' '), 0, 100, instr(ffuture_accrua, ' ')))))
;

update ffb010t 
set 
fcompany_first_fee_unit = 
decode(substr(fcompany_first_fe, instr(fcompany_first_fe, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fcompany_first_fee =
to_number(rtrim(substr(fcompany_first_fe, 0, decode(instr(fcompany_first_fe, ' '), 0, 100, instr(fcompany_first_fe, ' ')))))
;

update ffb010t 
set 
ftransport_equalize_unit = 
decode(substr(ftransport_equaliz, instr(ftransport_equaliz, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
ftransport_equalize =
to_number(rtrim(substr(ftransport_equaliz, 0, decode(instr(ftransport_equaliz, ' '), 0, 100, instr(ftransport_equaliz, ' ')))))
;

update ffb010t 
set 
ffinal_transport_fee_unit = 
decode(substr(ffinal_transport_fe, instr(ffinal_transport_fe, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
ffinal_transport_fee =
to_number(rtrim(substr(ffinal_transport_fe, 0, decode(instr(ffinal_transport_fe, ' '), 0, 100, instr(ffinal_transport_fe, ' ')))))
;

update ffb010t 
set 
fsecond_pay_unit = 
decode(substr(fsecond_pa, instr(fsecond_pa, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fsecond_pay =
to_number(rtrim(substr(fsecond_pa, 0, decode(instr(fsecond_pa, ' '), 0, 100, instr(fsecond_pa, ' ')))))
;

update ffb010t 
set 
fsettlement_tail_fee_unit = 
decode(substr(fsettlement_tail_fe, instr(fsettlement_tail_fe, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fsettlement_tail_fee =
to_number(rtrim(substr(fsettlement_tail_fe, 0, decode(instr(fsettlement_tail_fe, ' '), 0, 100, instr(fsettlement_tail_fe, ' ')))))
;

update ffb010t 
set 
fgauge_discount_unit = 
decode(substr(fgauge_discoun, instr(fgauge_discoun, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fgauge_discount =
to_number(rtrim(substr(fgauge_discoun, 0, decode(instr(fgauge_discoun, ' '), 0, 100, instr(fgauge_discoun, ' ')))))
;

update ffb010t 
set 
fdrain_equalize_unit = 
decode(substr(fdrain_equaliz, instr(fdrain_equaliz, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fdrain_equalize =
to_number(rtrim(substr(fdrain_equaliz, 0, decode(instr(fdrain_equaliz, ' '), 0, 100, instr(fdrain_equaliz, ' ')))))
;

update ffb010t 
set 
finsurance_fee_unit = 
decode(substr(finsurance_fe, instr(finsurance_fe, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
finsurance_fee =
to_number(rtrim(substr(finsurance_fe, 0, decode(instr(finsurance_fe, ' '), 0, 100, instr(finsurance_fe, ' ')))))
;

update ffb010t 
set 
fissue_price_unit = 
decode(substr(fissue_pric, instr(fissue_pric, ' ')+1), 'ay', '澳元', 'my', '美元', 'oy', '欧元', 'rmb', '人民币', 'ry', '日元'),
fissue_price =
to_number(rtrim(substr(fissue_pric, 0, decode(instr(fissue_pric, ' '), 0, 100, instr(fissue_pric, ' ')))))
;



select f0 , fsettlement_pric, fsettlement_price, fsettlement_price_unit, fship_settlement_pric, fship_settlement_price, fship_settlement_price_unit, flc_first_fe, flc_first_fee, flc_first_fee_unit, ffuture_accrua, ffuture_accrual, ffuture_accrual_unit, fcompany_first_fe, fcompany_first_fee, fcompany_first_fee_unit, ftransport_equaliz, ftransport_equalize, ftransport_equalize_unit, ffinal_transport_fe, ffinal_transport_fee, ffinal_transport_fee_unit, fsecond_pa, fsecond_pay, fsecond_pay_unit, fsettlement_tail_fe, fsettlement_tail_fee, fsettlement_tail_fee_unit, fgauge_discoun, fgauge_discount, fgauge_discount_unit, fdrain_equaliz, fdrain_equalize, fdrain_equalize_unit, finsurance_fe, finsurance_fee, finsurance_fee_unit, fissue_pric, fissue_price, fissue_price_unit from ffb010t 