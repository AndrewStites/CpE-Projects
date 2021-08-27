################################################################################
# Automatically-generated file. Do not edit!
# Toolchain: GNU Tools for STM32 (9-2020-q2-update)
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../util/DWT_Delay.c \
../util/Timer_Delay.c 

OBJS += \
./util/DWT_Delay.o \
./util/Timer_Delay.o 

C_DEPS += \
./util/DWT_Delay.d \
./util/Timer_Delay.d 


# Each subdirectory must supply rules for building sources it contributes
util/%.o: ../util/%.c util/subdir.mk
	arm-none-eabi-gcc "$<" -mcpu=cortex-m4 -std=gnu11 -g3 -DDEBUG -DUSE_HAL_DRIVER -DSTM32L432xx -c -I../Core/Inc -IC:/Users/andre/STM32Cube/Repository/STM32Cube_FW_L4_V1.17.0/Drivers/STM32L4xx_HAL_Driver/Inc -IC:/Users/andre/STM32Cube/Repository/STM32Cube_FW_L4_V1.17.0/Drivers/STM32L4xx_HAL_Driver/Inc/Legacy -IC:/Users/andre/STM32Cube/Repository/STM32Cube_FW_L4_V1.17.0/Drivers/CMSIS/Device/ST/STM32L4xx/Include -IC:/Users/andre/STM32Cube/Repository/STM32Cube_FW_L4_V1.17.0/Drivers/CMSIS/Include -O0 -ffunction-sections -fdata-sections -Wall -fstack-usage -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" --specs=nano.specs -mfpu=fpv4-sp-d16 -mfloat-abi=hard -mthumb -o "$@"

