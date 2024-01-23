import { Link } from "expo-router";
import { Text, View } from "react-native";
import Button from "./components/Button";

const Page = () => {
  return (
    <View style={{ flex: 1 }}>
      <Link
        href={{
          pathname: "/nativelist"
        }}
        asChild
      >
        <Button btnClassName={"w-80 h-20 self-center my-3"}>
          <Text>Native List</Text>
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
          pathname: "/video"
        }}
        asChild
      >
        <Button btnClassName={"w-80 h-20 self-center my-3"}>
          <Text>Video</Text>
        </Button>
      </Link>
    </View>
  );
};

export default Page;
