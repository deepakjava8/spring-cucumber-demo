Feature: the version can be retrieved
	Scenario: client make call to GET /customer
		When the client calls /customer
		Then the employee receives status code of 200
		And the response should contain:
		  ---
		  {"id": "101","name": "amit","email": "amit@gmail.com"}
		  ---