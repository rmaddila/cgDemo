/**
 * CREATE Script for init of DB
 */

-- Create  OFFLINE Accounts

insert into Account (account_number, account_name, contact_name, contact_email, contact_number, Created_by)
values (1001,'MCDonland USA', 'Randy Lee','Randy@abc.com','123293282','System');

insert into Account (account_number, account_name, contact_name, contact_email, contact_number, Created_by)
values (1005,'Chipotle USA', 'Lisa Lee','LisaJone@Walmart.com','9281232232','System');
insert into Account (account_number, account_name, contact_name, contact_email, contact_number, Created_by)
values (1006,'WalMart USA', 'Adam Jon','AdamJone@Walmart.com','2202122323','System');
insert into Account (account_number, account_name, contact_name, contact_email, contact_number, Created_by)
values (1008,'WalGreen USA', 'Neil Joe','neilJ@Walgreen.com','8869231234','System');
insert into Account (account_number, account_name, contact_name, contact_email, contact_number, Created_by)
values (1009,'CVS USA', 'Mike Penne','mikeP@cvs.com','2928323343','System');




-- Create Policy Data

insert into Policy (policy_number,policy_name,business_line,issued_country,policy_currency,
policy_type,inception_date,expiration_date,issue_date,policy_Limit,policy_premium,coverage_type,broker_name,
insured_name,account_number,Created_by)
values (12923,'McDonland USA Policy', 'Property','USA','USD','Local','01-01-2020','01-01-2022','01-10-2020',19282322,12323,'Business Interruption','Avon',
'McDonlad USA',1001,  'system');

insert into Policy (policy_number,policy_name,business_line,issued_country,policy_currency,
policy_type,inception_date,expiration_date,issue_date,policy_Limit,policy_premium,coverage_type,broker_name,
insured_name,account_number,Created_by)
values(34323,'McDonland India', 'Property','IND','INR','Local','01-01-2020','01-01-2022','01-10-2020',19282322,12323,'Business Interruption','Avon',
'McDonlad India',1001,'system');

insert into Policy (policy_number,policy_name,business_line,issued_country,policy_currency,
policy_type,inception_date,expiration_date,issue_date,policy_Limit,policy_premium,coverage_type,broker_name,
insured_name,account_number,Created_by)
values(29233,'McDonland Europe', 'Property','EUR','EUR','Local','01-01-2020','01-01-2022','01-10-2020',19282322,12323,'Business Interruption','Avon',
'McDonlad Europe',1001,'system');

insert into Policy (policy_number,policy_name,business_line,issued_country,policy_currency,
 policy_type,inception_date,expiration_date,issue_date,policy_Limit,policy_premium,coverage_type,broker_name,
 insured_name,account_number,Created_by)
 values
  (1292292833,'Chipotle USA Policy', 'Property','USA','USD','Local','01-01-2020','01-01-2022','01-10-2020',19282322,12323,'Business Interruption','Avon',
   'McDonlad USA',1005,  'system');

insert into Policy (policy_number,policy_name,business_line,issued_country,policy_currency,
policy_type,inception_date,expiration_date,issue_date,policy_Limit,policy_premium,coverage_type,broker_name,
insured_name,account_number,Created_by)
values
 (9283022,'Chipotle India Policy', 'Property','IND','INR','Local','01-01-2020','01-01-2022','01-10-2020',19282322,12323,'Business Interruption','Avon',
  'Chipotle India',1005,  'system');
  insert into Policy (policy_number,policy_name,business_line,issued_country,policy_currency,
  policy_type,inception_date,expiration_date,issue_date,policy_Limit,policy_premium,coverage_type,broker_name,
  insured_name,account_number,Created_by)
  values
   (1292123,'Chipotle Europe Policy', 'Property','EUR','EUR','Local','01-01-2020','01-01-2022','01-10-2020',19282322,12323,'Business Interruption','Avon',
    'McDonlad Europe',1005,  'system');

insert into Policy (policy_number,policy_name,business_line,issued_country,policy_currency,
 policy_type,inception_date,expiration_date,issue_date,policy_Limit,policy_premium,coverage_type,broker_name,
 insured_name,account_number,Created_by)
 values
  (12923223,'Walmart USA Policy', 'Property','USA','USD','Local','01-01-2020','01-01-2022','01-10-2020',19282322,12323,'Business Interruption','Avon',
   'WalMart USA',1006,  'system');

insert into Policy (policy_number,policy_name,business_line,issued_country,policy_currency,
policy_type,inception_date,expiration_date,issue_date,policy_Limit,policy_premium,coverage_type,broker_name,
insured_name,account_number,Created_by)
values
 (928343232,'Walmart India Policy', 'Property','IND','INR','Local','01-01-2020','01-01-2022','01-10-2020',19282322,12323,'Business Interruption','Avon',
  'WalMar India',1006,  'system');
  insert into Policy (policy_number,policy_name,business_line,issued_country,policy_currency,
  policy_type,inception_date,expiration_date,issue_date,policy_Limit,policy_premium,coverage_type,broker_name,
  insured_name,account_number,Created_by)
  values
   (1293323,'WalMart Europe Policy', 'Property','EUR','EUR','Local','01-01-2020','01-01-2022','01-10-2020',19282322,12323,'Business Interruption','Avon',
    'WalMart Europe',1006,  'system');

insert into Policy (policy_number,policy_name,business_line,issued_country,policy_currency,
 policy_type,inception_date,expiration_date,issue_date,policy_Limit,policy_premium,coverage_type,broker_name,
 insured_name,account_number,Created_by)
 values
  (33332,'WallGreen USA Policy', 'Property','USA','USD','Local','01-01-2020','01-01-2022','01-10-2020',19282322,12323,'Business Interruption','Avon',
   'WallGreen USA',1008,  'system');

insert into Policy (policy_number,policy_name,business_line,issued_country,policy_currency,
policy_type,inception_date,expiration_date,issue_date,policy_Limit,policy_premium,coverage_type,broker_name,
insured_name,account_number,Created_by)
values
 (343233,'WalGreen India Policy', 'Property','IND','INR','Local','01-01-2020','01-01-2022','01-10-2020',19282322,12323,'Business Interruption','Avon',
  'WalGreen India',1008,  'system');
  insert into Policy (policy_number,policy_name,business_line,issued_country,policy_currency,
  policy_type,inception_date,expiration_date,issue_date,policy_Limit,policy_premium,coverage_type,broker_name,
  insured_name,account_number,Created_by)
  values
   (323334,'WalGreen Europe Policy', 'Property','EUR','EUR','Local','01-01-2020','01-01-2022','01-10-2020',19282322,12323,'Business Interruption','Avon',
    'WalGreen Europe',1008,  'system');

insert into Policy (policy_number,policy_name,business_line,issued_country,policy_currency,
 policy_type,inception_date,expiration_date,issue_date,policy_Limit,policy_premium,coverage_type,broker_name,
 insured_name,account_number,Created_by)
 values
  (3343223,'CVS USA Policy', 'Property','USA','USD','Local','01-01-2020','01-01-2022','01-10-2020',19282322,12323,'Business Interruption','Avon',
   'CVS USA',1009,  'system');

insert into Policy (policy_number,policy_name,business_line,issued_country,policy_currency,
policy_type,inception_date,expiration_date,issue_date,policy_Limit,policy_premium,coverage_type,broker_name,
insured_name,account_number,Created_by)
values
 (223223,'CVS India Policy', 'Property','IND','INR','Local','01-01-2020','01-01-2022','01-10-2020',19282322,12323,'Business Interruption','Avon',
  'CVS India',1005,  'system');

  insert into Policy (policy_number,policy_name,business_line,issued_country,policy_currency,
  policy_type,inception_date,expiration_date,issue_date,policy_Limit,policy_premium,coverage_type,broker_name,
  insured_name,account_number,Created_by)
  values
   (3434534,'CVS Europe Policy', 'Property','EUR','EUR','Local','01-01-2020','01-01-2022','01-10-2020',19282322,12323,'Business Interruption','Avon',
    'CVS Europe',1005,  'system');
