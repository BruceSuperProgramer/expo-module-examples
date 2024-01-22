import { StyledComponent } from "nativewind";
import { ReactNode, forwardRef } from "react";
import { TouchableOpacity, TouchableOpacityProps } from "react-native";

interface Props extends TouchableOpacityProps {
  btnClassName: string;
  children: ReactNode;
}

const Button = forwardRef(({ btnClassName, children, onPress }: Props, ref) => {
  return (
    <StyledComponent
      component={TouchableOpacity}
      className={`items-center justify-center bg-pink-400 rounded ${btnClassName}`}
      onPress={onPress}
    >
      {children}
    </StyledComponent>
  );
});

export default Button;
