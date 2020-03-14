INSERT INTO STUDENT(studID,FNAME,LNAME,EMAIL,password) values('1EL16DW001','Ross','Stanley','Ross.Stanley@gmail.com','ross');
INSERT INTO STUDENT(studID,FNAME,LNAME,EMAIL,password) values('1EL16DW002','Ross','Stuart','Ross.Stuart@gmail.com','ross');
INSERT INTO STUDENT(studID,FNAME,LNAME,EMAIL,password) values('1EL16DW003','Edwards','Peter','Edwards.Peter@gmail.com','edwards');
INSERT INTO STUDENT(studID,FNAME,LNAME,EMAIL,password) values('1EL16DW004','Thompson','Bob','Thompson.Bob@gmail.com','thompson');
INSERT INTO STUDENT(studID,FNAME,LNAME,EMAIL,password) values('1EL16DW005','Smythe','Carol','Smythe.Carol@gmail.com','smythe');
INSERT INTO STUDENT(studID,FNAME,LNAME,EMAIL,password) values('1EL16DW006','Hayes','Evelyn','Hayes.Evelyn@yahoo.com','hayes');
INSERT INTO STUDENT(studID,FNAME,LNAME,EMAIL,password) values('1EL16DW007','Evans','Michael','Evans.Michael@yahoo.com','evans');
INSERT INTO STUDENT(studID,FNAME,LNAME,EMAIL,password) values('1EL16DW008','Raveen','Lemont','Raveen.Lemont@yahoo.com','raveen');
INSERT INTO STUDENT(studID,FNAME,LNAME,EMAIL,password) values('1EL16DW009','James','Mary','James.Mary@yahoo.com','james');
INSERT INTO STUDENT(studID,FNAME,LNAME,EMAIL,password) values('1EL16DW010','Williams','Judy','Williams.Judy@yahoo.com','williams');

INSERT INTO COURSES values('16DW01','English');
INSERT INTO COURSES values('16DW02','Sanskrit');
INSERT INTO COURSES values('16DW03','Kannada');
INSERT INTO COURSES values('16DW04','Social Science');
INSERT INTO COURSES values('16DW05','Maths');
INSERT INTO COURSES values('16DW06','Science');

insert into TESTS_TAKEN(STUDID,COURSEID,SCORE) values('1EL16DW001','16DW02','75');
insert into TESTS_TAKEN(STUDID,COURSEID,SCORE) values('1EL16DW002','16DW06','86');
insert into TESTS_TAKEN(STUDID,COURSEID,SCORE) values('1EL16DW003','16DW03','48');
insert into TESTS_TAKEN(STUDID,COURSEID,SCORE) values('1EL16DW004','16DW01','79');
insert into TESTS_TAKEN(STUDID,COURSEID,SCORE) values('1EL16DW005','16DW04','81');
insert into TESTS_TAKEN(STUDID,COURSEID,SCORE) values('1EL16DW006','16DW02','56');
insert into TESTS_TAKEN(STUDID,COURSEID,SCORE) values('1EL16DW007','16DW05','63');
insert into TESTS_TAKEN(STUDID,COURSEID,SCORE) values('1EL16DW008','16DW06','37');
insert into TESTS_TAKEN(STUDID,COURSEID,SCORE) values('1EL16DW009','16DW02','78');
insert into TESTS_TAKEN(STUDID,COURSEID,SCORE) values('1EL16DW010','16DW01','96');
insert into TESTS_TAKEN(STUDID,COURSEID,SCORE) values('1EL16DW001','16DW01','50');
insert into TESTS_TAKEN(STUDID,COURSEID,SCORE) values('1EL16DW002','16DW05','89');
insert into TESTS_TAKEN(STUDID,COURSEID,SCORE) values('1EL16DW003','16DW04','15');
insert into TESTS_TAKEN(STUDID,COURSEID,SCORE) values('1EL16DW004','16DW06','60');
insert into TESTS_TAKEN(STUDID,COURSEID,SCORE) values('1EL16DW005','16DW02','35');
insert into TESTS_TAKEN(STUDID,COURSEID,SCORE) values('1EL16DW006','16DW03','90');
insert into TESTS_TAKEN(STUDID,COURSEID,SCORE) values('1EL16DW007','16DW03','23');
insert into TESTS_TAKEN(STUDID,COURSEID,SCORE) values('1EL16DW008','16DW03','78');
insert into TESTS_TAKEN(STUDID,COURSEID,SCORE) values('1EL16DW009','16DW01','98');
insert into TESTS_TAKEN(STUDID,COURSEID,SCORE) values('1EL16DW010','16DW06','38');

INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('1','with','over','on','round','c','Fate smiles ...... those who untiringly grapple with stark realities of life.','English');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('2','avidly','admiringly','thoughtfully','earnestly','a','The miser gazed ...... at the pile of gold coins in front of him.','English');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('3','chance','luck','possibility','occasion','a','Catching the earlier train will give us the ...... to do some shopping.','English');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('4','group','herd','swarm','flock','b','I saw a .... of cows in the field','English');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('5','ready','mature','ripe','ripe','c','The grapes are now .... ripe enough to be picked.','English');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('6','at','over','for','on','d','Success in this examination depends ...... hard work alone.','English');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('7','myself','me','mine','I','b','My uncle decided to take ...... and my sister to the market.','English');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('8','possessed','punished','confiscated','fined','c','If you smuggle goods into the country,they may be .... by the customs authority.','English');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('9','food','bread','meals','diet','b','Man does not live by ...... alone.','English');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('10','alike','unique','different','likely','a','Rohan and Rohit are twin brothers, but they do not look ......','English');

INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('11','Kanaka Dasa','Purandara Dasa','Raghavanka','Sarvagna','b',' Who is known as “Father of Karnataka music”?','Kannada');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('12','1987','1984','1986',' 1990','b','  Karnataka Lokayukta Act was enacted in which among the following years?','Kannada');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('13','Govinda III','Amoghavarsha','Pulikeshi','Danthidurga','b',' Kavirajamarga” is the earliest available writing on poetic and grammar in the Kannada literature. It was written by which of the following King?','Kannada');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('14','Mysore','Bimaru','Amindivi','None of These','a',' How was Karnataka formerly known?','Kannada');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('15',' 15, 70','12, 28','5, 30','None of These','b',' How many seats have been allocated for Karnataka in Rajyasabha and Loksabha?','Kannada');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('16','Dussera','Yogadi','Hampi festival','All of these','d',' Adi Shankaracharya established his first of four “mathas” at?','Kannada');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('17','Tumkur','Ganesh temple','Belgaum','Sringeri','d',' Who is known as “Father of Karnataka music”?','Kannada');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('18','Bellary','Vijayapur','Shimoga','Kodagu','d','_____ is the smallest district in Karnataka by population?','Kannada');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('19','Hermann Gundert','Hermann Mogling','Ferdinand Kittel','None of the above','c','Who had written the first Kannada-English dictionary','Kannada');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('20','Gubbi Veeranna','Gubbi Veeranna','Sati Sulochana','Pandaribai','c',' Which one is the first Kannada movie','Kannada');

INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('21','ऋग्वेदे','यजुर्वेदे','सामवेदे','अथर्ववेदे','a','कस्मिन वेदे गायत्री छंदस्य सर्वाधिक प्रयोगोSभवत् ?','Sanskrit');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('22','भवस्वामी','उव्वट','माधव','महीधर','c','सामवेदस्य प्रथम भाष्यकार: क: ?','Sanskrit');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('23','साम वेदस्य','शुक्ल यजुर्वेदस्य','कृष्णयजुर्वेदस्य','अथर्वववेदस्य','c','काठक, कपिष्ठल इत्यादय: कस्य वेदस्य शाखामस्ति ?','Sanskrit');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('24','नवम मण्डले','अष्टम मण्डले','दशम मण्डले','चतुर्थ मण्डले','a','सोमदेवाय स्तुति ऋग्वेदस्य कस्मिन मण्डले वर्तते ?','Sanskrit');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('25','द्योस्','आदित्य','अग्नि','मित्रावरुण','b','वेदानां सामूहिक देवतास्ति ?','Sanskrit');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('26','६','७','५','२','d','अथर्ववेदस्य मन्त्रा:कति भागे विभाजितमस्ति ?','Sanskrit');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('27','शुक्ल यजुर्वेदे','कृष्ण यजुर्वेदे','सामवेदे','अथर्ववेदे','c','पुष्य सूक्त प्रातिशाख्य कस्मिन वेदे समुपलभ्यते ?','Sanskrit');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('28','४','३','५',' २','b','सामवेदानुसारेण कति ग्रामा: ?','Sanskrit');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('29','आंगीरस वेद:','भूग्वंङीरोवेद:','महीवेद:','कल्पोक्तवेद:','d','अथर्ववेदस्य उपनाम नास्ति ?','Sanskrit');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('30','चत्वारः','सप्त','षड','पंच','c','बृहदारण्यकोपनिषदे आत्मन: कति अवस्थाया:वर्णनमस्ति ?','Sanskrit');

INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('31','Gangetic Valley','Southern part of Vindhya Mountain','North Western Indian Valley','North Eastern part of India','b','Which is considered as the most ancient part of the world by historians?','Social Science');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('32','Karnataka','Bihar','Bengal','Tamil Nadu','b','The State that comprises more number of Buddhist Viharas is?','Social Science');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('33','Robert Clive','Duplex','Mirjafer','Hestings','a','The person who established British rule in India','Social Science');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('34','Tamil','Pali','Sanskrit','Kharosti','c','The official language of Pallavas was','Social Science');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('35','Indian Ocean','Arctic Ocean','Pacific Ocean','Atlantic Ocean','c','Which Ocean has one third of land surface in the world','Social Science');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('36','Topography','Demography','Cartography','Geography','c','The science of constructing map is called','Social Science');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('37','Article 41','Article 43','Article 45','Article 44','c','The Article which deals with Education for All','Social Science');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('38','White Edible Oil','Fruit Production','Milk Production','White Poultry & Egg','c','White Revolution is associated with','Social Science');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('39','Production, Labour, Income','Production, Labour, Consumption','Production, Distribution, Income','Production, Distribution, Consumption','d','The basic features of Economics are','Social Science');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('40','Cholas','Later Cholas','Pallavas','Later Pallavas','b','Iconography was introduced by','Social Science');

INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('41','45%','45.5%','54.6%','55%','b','A batsman scored 110 runs which included 3 boundaries and 8 sixes. What percent of his total score did he make by running between the wickets?','Maths');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('42','39, 30','41, 32','42, 33','43, 34','c','Two students appeared at an examination. One of them secured 9 marks more than the other and his marks was 56% of the sum of their marks. The marks obtained by them are:','Maths');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('43','588 apples','600 apples','672 apples','700 apples','d','A fruit seller had some apples. He sells 40% apples and still has 420 apples. Originally, he had:','Maths');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('44','1','14','20','21','c','What percentage of numbers from 1 to 70 have 1 or 9 in the units digit?','Maths');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('45','A is smaller than B.','A is greater than B','Relationship between A and B cannot be determined.','None of these','d','If A = x% of y and B = y% of x, then which of the following is true?','Maths');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('46',' 25.30','25.5','25.00','12.25','b','The average of first 50 natural numbers is …','Maths');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('47','1/55','55','3/11','1/11','a',' A fraction which bears the same ratio to 1/27 as 3/11 bear to 5/9 is equal to ………','Maths');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('48','149','166','150','151','c','The number of 3-digit numbers divisible by 6, is …','Maths');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('49','52','502','520','5002','b','What is 1004 divided by 2?','Maths');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('50','78','136','156','196','c','A clock strikes once at 1 Oclock, twice at 2 Oclock, thrice at 3 Oclock and so on. How many times will it strike in 24 hours?','Maths');

INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('51','Infinite','Very short Subnuclear size','Very short Nuclear size','None','c','What is the range of Strong Nuclear force?','Science');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('52','Slug','a.m.u','Hyperkg','C.S.L','d','Which of the following is the largest practical unit of mass?','Science');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('53','Hydrogen','Rubidium','Cesium','Barium','c','The Atomic clock is based on the periodic vibrations produced in the atom of which element?','Science');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('54','Gravitational','Electric','Magnetic','All of the Above','d','Newton’s third law of motion applies  to which of these forces?','Science');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('55','9.8 km s-2','1.6 km s-2','11.2 km s-2','7.92 km s-2','c','What is the value of escape velocity for earth?','Science');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('56','It is a freely falling body','it does not require energy for its motion in orbit','it suffers an acceleration','it moves with constant speed','c','Which of the following is incorrect about a satellite?','Science');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('57','Tensile strength','Shear strength','Bulk strength','Hooke’s strength','a','What is the maximum stress after which the wire breaks called as?','Science');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('58','Blaise Pascal','Daniel Bernoulli','Albert Einstein','Evangelista Torricelli','d','Who invented mercury barometer?','Science');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('59','Copper','Gold','Silver','Aluminium','b','Which of the following metal foils was used in the Rutherford’s alpha particle scattering experiment?','Science');
INSERT INTO QUESTIONS (qno,a,b,c,d,ans,question,subject) values('60','Amplifier','Voltage regulator','Attenuator','All of the above','a','Which of these devices is used to increase the power of a signal?','Science');





