///LAB 5
 __HAL_TIM_SetCompare(&htim1, TIM_CHANNEL_4, 500); // PWM sets servo to 0 degrees
	  HAL_Delay(1000);
	  __HAL_TIM_SetCompare(&htim1, TIM_CHANNEL_4, 250); // PWM sets servo to 90 degrees
	  HAL_Delay(1000);
	  __HAL_TIM_SetCompare(&htim1, TIM_CHANNEL_4, 100); // PWM sets servo to 180 degrees
	  HAL_Delay(1000);