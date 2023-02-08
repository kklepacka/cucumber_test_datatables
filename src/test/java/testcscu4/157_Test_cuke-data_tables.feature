# language: en
Feature: Test_cuke-data_tables

	Scenario: Test_cuke-data_tables
		Given test '
			| produit | prix |
			| test '| 0.40 |
		Given Test ` echo test `
			| produit | prix |
			| Test ` echo test `| 0.40 |
		Given Test $test
			| produit | prix |
			| Test $test| 0.40 |
		Given Test & echo toto
			| produit | prix |
			| Test & echo toto| 0.40 |
		Given Test ; echo toto
			| produit | prix |
			| Test ; echo toto| 0.40 |
		Given Test | echo toto
			| produit | prix |
			| Test \| echo toto| 0.40 |
		Given Test ^
			| produit | prix |
			| Test ^| 0.40 |
		Given Test %test%
			| produit | prix |
			| Test %test%| 0.40 |
		Given Test ${echo test}
			| produit | prix |
			| Test ${echo test}| 0.40 |
		Given Test $(echo test)
			| produit | prix |
			| Test $(echo test)| 0.40 |
		Given Test #test
			| produit | prix |
			| Test #test| 0.40 |
		Given Test 𨱏
			| produit | prix |
			| Test 𨱏| 0.40 |
		Given Test 👩‍❤️‍💋‍👨
			| produit | prix |
			|Test 👩‍❤️‍💋‍👨|rere|
		Given Test [test]
			| produit | prix |
			| Test [test]| 0.40 |
		Given Test ^^
			| produit | prix |
			| Test ^^| 0.40 |
		Given Test ,.+-_~@€çé=àû*?!
			| produit | prix |
			| Test ,.+-_~@€çé=àû*?!| 0.40 |
		Given Test ./test
			| produit | prix |
			| Test ./test| 0.40 |