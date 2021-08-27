 while (1)
  {
	  if(HAL_GPIO_ReadPin(GPIOB, GPIO_PIN_3))
	  {
		  HAL_GPIO_WritePin(GPIOB, GPIO_PIN_4, GPIO_PIN_SET);
	  } else {
		  HAL_GPIO_WritePin(GPIOB, GPIO_PIN_4, GPIO_PIN_RESET);
	  }
	  HAL_Delay(100);
    /* USER CODE END WHILE */

    /* USER CODE BEGIN 3 */
  }
  /* USER CODE END 3 */
}


 while (1)
     {
   	  if(HAL_GPIO_ReadPin(GPIOB, GPIO_PIN_3))
   	  {
   		  HAL_GPIO_WritePin(GPIOB, GPIO_PIN_6, GPIO_PIN_RESET);
   		  HAL_GPIO_WritePin(GPIOB, GPIO_PIN_5, GPIO_PIN_SET);
   		  HAL_GPIO_WritePin(GPIOB, GPIO_PIN_4, GPIO_PIN_SET);
   	  } else {
   		  HAL_GPIO_WritePin(GPIOB, GPIO_PIN_6, GPIO_PIN_SET);
   		  HAL_GPIO_WritePin(GPIOB, GPIO_PIN_5, GPIO_PIN_RESET);
   		  HAL_GPIO_WritePin(GPIOB, GPIO_PIN_4, GPIO_PIN_RESET);
   	  }
   	  HAL_Delay(100);
     /* USER CODE END WHILE */

     /* USER CODE BEGIN 3 */
     }
   /* USER CODE END 3 */
}

 while (1)
    {
  	  if(HAL_GPIO_ReadPin(GPIOB, GPIO_PIN_3))
  	  {
  		  HAL_GPIO_TogglePin(GPIOB, GPIO_PIN_6);
  		HAL_Delay(100);
  		  HAL_GPIO_TogglePin(GPIOB, GPIO_PIN_5);
  		HAL_Delay(100);
  		  HAL_GPIO_TogglePin(GPIOB, GPIO_PIN_4);
  		HAL_Delay(100);

//  		  HAL_GPIO_WritePin(GPIOB, GPIO_PIN_6, GPIO_PIN_RESET);
//  		  HAL_GPIO_WritePin(GPIOB, GPIO_PIN_5, GPIO_PIN_SET);
//  		  HAL_GPIO_WritePin(GPIOB, GPIO_PIN_4, GPIO_PIN_RESET);
  	  }
  	  HAL_Delay(100);
    /* USER CODE END WHILE */

    /* USER CODE BEGIN 3 */
    }
  /* USER CODE END 3 */
}



//PART 2
typedef enum
{
	Transition_NS_State,
	NS_Pass_EW_Stop_State,
	All_Stop_EW_State,
	NS_Stop_EW_Pass_State,
	Transition_EW_State,
	All_Stop_NS_State
}eSystemState;

/* Prototype Event Handlers */
eSystemState NorthSouthPassHandler(void)
{
	HAL_GPIO_WritePin(GPIOB, NS_GREEN_LED_Pin, GPIO_PIN_SET);
	HAL_GPIO_WritePin(GPIOB, NS_YELLOW_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOA, NS_RED_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOA, EW_GREEN_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOA, EW_YELLOW_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOA, EW_RED_LED_Pin, GPIO_PIN_SET);
	HAL_Delay(10*1000); //10 seconds
	return Transition_NS_State;
}

eSystemState TransitionNorthSouthHandler(void)
{
	HAL_GPIO_WritePin(GPIOB, NS_GREEN_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOB, NS_YELLOW_LED_Pin, GPIO_PIN_SET);
	HAL_GPIO_WritePin(GPIOA, NS_RED_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOA, EW_GREEN_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOA, EW_YELLOW_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOA, EW_RED_LED_Pin, GPIO_PIN_SET);
	HAL_Delay(5*1000); //5 seconds
	return All_Stop_EW_State;
}eSystemState

AllStopEastWestHandler(void)
{
	HAL_GPIO_WritePin(GPIOB, NS_GREEN_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOB, NS_YELLOW_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOA, NS_RED_LED_Pin, GPIO_PIN_SET);
	HAL_GPIO_WritePin(GPIOA, EW_GREEN_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOA, EW_YELLOW_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOA, EW_RED_LED_Pin, GPIO_PIN_SET);
	HAL_Delay(5*1000); //5 seconds
	return NS_Stop_EW_Pass_State;
}

eSystemState EastWestPassHandler(void)
{
	HAL_GPIO_WritePin(GPIOB, NS_GREEN_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOB, NS_YELLOW_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOA, NS_RED_LED_Pin, GPIO_PIN_SET);
	HAL_GPIO_WritePin(GPIOA, EW_GREEN_LED_Pin, GPIO_PIN_SET);
	HAL_GPIO_WritePin(GPIOA, EW_YELLOW_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOA, EW_RED_LED_Pin, GPIO_PIN_RESET);
	HAL_Delay(10*1000); //10 seconds
	return Transition_EW_State;
}

eSystemState TransitionEastWestHandler(void)
{
	HAL_GPIO_WritePin(GPIOB, NS_GREEN_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOB, NS_YELLOW_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOA, NS_RED_LED_Pin, GPIO_PIN_SET);
	HAL_GPIO_WritePin(GPIOA, EW_GREEN_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOA, EW_YELLOW_LED_Pin, GPIO_PIN_SET);
	HAL_GPIO_WritePin(GPIOA, EW_RED_LED_Pin, GPIO_PIN_RESET);
	HAL_Delay(5*1000); //5 seconds
	return All_Stop_NS_State;
}

eSystemState AllStopNorthSouthHandler(void)
{
	HAL_GPIO_WritePin(GPIOB, NS_GREEN_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOB, NS_YELLOW_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOA, NS_RED_LED_Pin, GPIO_PIN_SET);
	HAL_GPIO_WritePin(GPIOA, EW_GREEN_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOA, EW_YELLOW_LED_Pin, GPIO_PIN_RESET);
	HAL_GPIO_WritePin(GPIOA, EW_RED_LED_Pin, GPIO_PIN_SET);
	HAL_Delay(5*1000); //5 seconds
	return NS_Pass_EW_Stop_State;

}

while (1)
      {
  	  switch(eNextState)
  	  {
  	  case Transition_NS_State: eNextState = TransitionNorthSouthHandler();
  	  break;

  	  case NS_Pass_EW_Stop_State: eNextState = NorthSouthPassHandler();
  	  break;

  	  case All_Stop_EW_State: eNextState = AllStopEastWestHandler();
  	  break;

  	  case NS_Stop_EW_Pass_State: eNextState = EastWestPassHandler();
  	  break;

  	  case Transition_EW_State: eNextState = TransitionEastWestHandler();
  	  break;

  	  case All_Stop_NS_State: eNextState = AllStopNorthSouthHandler();
  	  break;

  	  default: eNextState = AllStopNorthSouthHandler();
  	  break;
  	  }
    	}

      /* USER CODE END WHILE */

      /* USER CODE BEGIN 3 */

    /* USER CODE END 3 */
  }

  //Changed the EastWestPassHandler() so that there is no delay and made the method recursive
   while (1)
        {

  	  if(HAL_GPIO_ReadPin(GPIOB, GPIO_PIN_3))
  		       	  {

  		       		eNextState = Transition_EW_State;



  		       	  }
    	  switch(eNextState)
    	  {

    	  case Transition_NS_State: eNextState = TransitionNorthSouthHandler();
    	  break;

    	  case NS_Pass_EW_Stop_State: eNextState = NorthSouthPassHandler();
    	  break;

    	  case All_Stop_EW_State: eNextState = AllStopEastWestHandler();
    	  break;

    	  case NS_Stop_EW_Pass_State: eNextState = EastWestPassHandler();
    	  break;

    	  case Transition_EW_State: eNextState = TransitionEastWestHandler();
    	  break;

    	  case All_Stop_NS_State: eNextState = AllStopNorthSouthHandler();
    	  break;

    	  default: eNextState = AllStopNorthSouthHandler();
    	  break;
    	  }


        }

        /* USER CODE END WHILE */

        /* USER CODE BEGIN 3 */

      /* USER CODE END 3 */
    }
    ---------------------------------------------------------------------------------------
