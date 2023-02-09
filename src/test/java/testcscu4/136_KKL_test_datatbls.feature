# language: en
Feature: KKL_test_datatbls

	Scenario: KKL_test_datatbls
		Given Test \"
			| produit | prix |
			| Test "| 0.40 |
		Given Test \< /tmp
			| produit | prix |
			| Test < /tmp| 0.40 |
		Given Test \> /tmp
			| produit | prix |
			| Test > /tmp | 0.40 |
		Given Test 'test'
			| produit | prix |
			| Test 'test'| 0.40 |
		Given Test $test
			| produit | prix |
			| Test $test| 0.40 |
		Given Test \\
			| produit | prix |
			| Test \ | 0.40 |
		Given Test /
			| produit | prix |
			| Test /| 0.40 |
		Given Test |
			| produit | prix |
			| Test \|| 0.40 |