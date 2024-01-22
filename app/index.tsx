import { Link } from "expo-router";
import { withExpoSnack } from "nativewind";
import { Text, View } from "react-native";
import Button from "./components/Button";

const Page = () => {
  return (
    <View style={{ flex: 1 }}>
      <Link
        href={{
          pathname: "/home"
        }}
        asChild
      >
        <Button btnClassName={"w-80 h-20 self-center my-3"}>
          <Text>Home</Text>
        </Button>
      </Link>

      <Link
        href={{
          pathname: "/chart"
        }}
        asChild
      >
        <Button btnClassName={"w-80 h-20 self-center my-3"}>
          <Text>Chart</Text>
        </Button>
      </Link>

      <Link
        href={{
          pathname: "/login"
        }}
        asChild
      >
        <Button btnClassName={"w-80 h-20 self-center my-3"}>
          <Text>Login</Text>
        </Button>
      </Link>
    </View>
  );
};

export default withExpoSnack(Page);
